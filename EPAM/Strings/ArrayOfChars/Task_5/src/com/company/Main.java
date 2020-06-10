package com.company;
//5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
//Крайние пробелы в строке удалить.
public class Main {
    public static String removeSpaces(String string){
        StringBuilder stringBuilder = new StringBuilder();
        //удаляем пробелы в начале и в конце
        String str = string.trim();
        boolean isSpace = false;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' ') {
                if (!isSpace) {
                    stringBuilder.append(" ");
                }
                isSpace = true;
            } else {
                stringBuilder.append(str.charAt(i));
                isSpace = false;
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String string = " There    are a  lot of  spaces.";
        System.out.println(removeSpaces(string));
    }
}
