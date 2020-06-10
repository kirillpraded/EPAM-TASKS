package com.company;
//2. Замените в строке все вхождения 'word' на 'letter'.
public class Main {
    public static String replaceWord(String str){
        //если работать с строкой, как с массивом символов, происходит indexOutOfBound exc
        // чтобы избавиться от нее, можно ввести проверку на индексы, но, мне кажется, это будет неправильно
        StringBuilder strBuilder = new StringBuilder();
        String letter;
        for (int i = 0; i < str.length(); i++) {
            if (i + 3 < str.length() && str.charAt(i) == 'w'
                    && str.charAt(i + 1) == 'o'
                    && str.charAt(i + 2) == 'r'
                    && str.charAt(i + 3) == 'd') {
                strBuilder.append("letter");
                i += 3;
            } else {
                strBuilder.append(str.charAt(i));
            }
        }
        letter = strBuilder.toString();
        return letter;
    }

    public static void main(String[] args) {
	    String string = "This is word, we will change word to letter.";
        System.out.println(replaceWord(string));
        //Самый простой способ
        //System.out.println(string.replace("word", "letter"));
    }
}
