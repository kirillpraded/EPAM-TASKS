package com.company;
//2. В строке вставить после каждого символа 'a' символ 'b'.
public class Main {
    public static String appendB(String string){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == 'a'){
                stringBuilder.append('a');
                stringBuilder.append('b');
            }
            else {
                stringBuilder.append(string.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String string = "Every a letter will be changed to ab";
        System.out.println(appendB(string));
    }
}
