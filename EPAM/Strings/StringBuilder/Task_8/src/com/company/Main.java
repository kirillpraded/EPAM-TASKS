package com.company;
//8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
//длинных слов может быть несколько, не обрабатывать.
public class Main {

    public static String findLongestWord(String word){
        int length = 0;
        int maxlength = 0;
        int indexOf = 0;
        for (int i = 0; i < word.length(); i++){
            if(word.charAt(i) != ' '){
                length++;
                if(length > maxlength){
                    indexOf = i + 1 - length;
                    maxlength = length;
                }
            } else {
                length = 0;
            }
        }

        return word.substring(indexOf,indexOf + maxlength);
    }
    public static void main(String[] args) {
	    String string = "wors word word synchronization the longest word in english";
        System.out.println("Самое длинное слово в строке  -  " + findLongestWord(string));
    }
}
