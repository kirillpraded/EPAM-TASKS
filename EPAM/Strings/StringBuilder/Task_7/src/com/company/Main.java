package com.company;


import java.util.HashSet;
import java.util.Set;

//7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
//def", то должно быть выведено "abcdef".
public class Main {
    public static String removeSymbols(String string){
        StringBuilder stringBuilder = new StringBuilder(string);
        for( int i = 0 ; i < stringBuilder.length();i++){
            char character = stringBuilder.charAt(i);
            if(character == ' '){
                stringBuilder.deleteCharAt(i);
                i--;
                continue;
            }
            for (int j = i + 1; j < stringBuilder.length(); j++) {
                if(stringBuilder.charAt(j) == character) {
                    stringBuilder.deleteCharAt(j);
                }
            }
        }
        return  stringBuilder.toString();
    }

    public static void main(String[] args) {

    }
}
