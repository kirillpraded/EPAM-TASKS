package com.company;
//1. Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
//операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
//отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
//алфавиту.
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void doOperations(String text){
        Scanner scanner = new Scanner(System.in);
        String start = "1)Отсортировать абзацы по количеству предложений \n" +
                "2)Отсортировать слова по длинне в каждом предложении \n" +
                "\n3)отсортировать лексемы в предложении по убыванию количества " +
                "вхождений заданного символа, а в случае равенства – по\n" +
                "алфавиту." +
                " Для выхода введите 0\n";
        int numToChoise = 1;
        System.out.println(start);
        while (numToChoise != 0) {
            numToChoise = scanner.nextInt();
            switch (numToChoise) {
                case 1:
                    sortParagraphs(text);
                    break;
                case 2:
                    sortWords(text);
                    break;
                case 3:
                    sortTokens(text);
                    break;

                default:
                    System.out.println("неверный ввод\n");
            }
        }
        scanner.close();
    }

    public static void sortParagraphs(String text) {
        String[] paragraphs = text.split("\n");
        int[] countSent = new int[paragraphs.length];
        int maxLength = 0;
        for (int i = 0; i < paragraphs.length; i++) {
            String[] sentences = splitSent(paragraphs[i]);
            countSent[i] = sentences.length;
            if (maxLength < sentences.length) {
                maxLength = sentences.length;
            }
        }
        for (int i = 1; i <= maxLength; i++) {
            for (int j = 0; j < countSent.length; j++) {
                if (i == countSent[j]) {
                    System.out.println(paragraphs[j]);
                }
            }
        }
        System.out.println();
    }

    public static void sortWords(String text) {
        String[] paragraphs = text.split("\n");
        for (String paragraph : paragraphs) {
            String[] sentences = splitSent(paragraph);
            for (String sentence : sentences) {
                String[] words = splitWords(sentence);

                for (int k = words.length - 1; k >= 0; k--) {
                    for (int m = 0; m < k; m++) {
                        if (words[m].length() > words[m + 1].length()) {
                            String tmp = words[m];
                            words[m] = words[m + 1];
                            words[m + 1] = tmp;
                        }
                    }
                }

                for (String word : words) {
                    System.out.print(word + " ");
                }
                System.out.print("\b. ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void sortTokens(String text)  {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите символ для сортировки: ");
        String letter = scanner.nextLine();
        String[] paragraphs = text.split("\n");
        for (String paragraph : paragraphs) {
            String[] sentences = splitSent(paragraph);
            for (String sentence : sentences) {
                String[] words = splitWords(sentence);

                for (int k = words.length - 1; k >= 0; k--) {
                    for (int m = 0; m < k; m++) {
                        int countRight = 0;
                        int countLeft = 0;
                        for (int n = 0; n < words[m].length(); n++) {
                            if (String.valueOf(words[m].charAt(n)).compareToIgnoreCase(letter) == 0) {
                                countLeft++;
                            }
                        }
                        for (int n = 0; n < words[m + 1].length(); n++) {
                            if (String.valueOf(words[m + 1].charAt(n)).compareToIgnoreCase(letter) == 0) {
                                countRight++;
                            }
                        }
                        if (countLeft < countRight) {
                            String tmp = words[m];
                            words[m] = words[m + 1];
                            words[m + 1] = tmp;
                        } else if (countLeft == countRight) {
                            String[] forCompare = {words[m], words[m + 1]};
                            Arrays.sort(forCompare);
                            words[m] = forCompare[0];
                            words[m + 1] = forCompare[1];
                        }
                    }
                }
                for (String word : words) {
                    System.out.print(word + " ");
                }
                System.out.print("\b. ");
            }
            System.out.println();
        }
        System.out.println();
        scanner.close();
    }

    public static String[] splitSent(String text) {
        Pattern pattern = Pattern.compile("\\.*[.!?]\\s*");
        return pattern.split(text);
    }

    public static String[] splitWords(String sentence) {
        Pattern pattern = Pattern.compile("\\s*(\\s|,|;|:)\\s*");
        return pattern.split(sentence);
    }

    public static void main(String[] args) {
        String text = "Что такое регулярные выражения?\n" +
                "Если вам когда-нибудь приходилось работать с командной строкой, вы, вероятно, использовали маски имён" +
                " файлов. Например, чтобы удалить все файлы в текущей директории, которые начинаются с буквы “d”, можно написать rm d*.\n" +
                "\n" +
                "Регулярные выражения представляют собой похожий, но гораздо более сильный инструмент для поиска строк," +
                " проверки их на соответствие какому-либо шаблону и другой подобной работы. Англоязычное название этого" +
                " инструмента — Regular Expressions или просто RegExp. Строго говоря, регулярные выражения — специальный" +
                " язык для описания шаблонов строк.\n" +
                "\n" +
                "Реализация этого инструмента различается в разных языках программирования, хоть и не сильно. В данной " +
                "статье мы будем ориентироваться в первую очередь на реализацию Perl Compatible Regular Expressions. ";
        doOperations(text);
    }
}
