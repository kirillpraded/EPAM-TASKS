package com.company;

public class Main {
    //Используя StringBuilder
    public static String[] snakeCaseConvert(String[] strings){
        String[] snakeCase = new String[strings.length];
        for (int i = 0; i < strings.length; i++){
            StringBuilder strBuilder = new StringBuilder();

            for (int j = 0; j < strings[i].length(); j++) {
                char letter = strings[i].toCharArray()[j];
                if (Character.isLowerCase(letter)){
                    strBuilder.append(letter);
                } else {
                    strBuilder.append("_");

                    strBuilder.append(Character.toLowerCase(letter));
                }
            }
            snakeCase[i] = strBuilder.toString();
        }
        return snakeCase;
    }
    //используя массив символов
    public static String[] snakeCaseConvertV2(String[] strings){
        String[] snakeCase = new String[strings.length];
        for (int i = 0; i < strings.length; i++){
            char[] arr = strings[i].toCharArray();
            int indexOfUpper = 0;
            for (int j = 0; j < arr.length; j++) {
                if (Character.isUpperCase(arr[j])) {
                    indexOfUpper = j;
                }
            }
            char[] result = new char[arr.length+1];
            for (int j = 0; j <= indexOfUpper; j++){
                if(j == indexOfUpper){
                    result[j] = '_';
                } else{
                    result[j] = arr[j];
                }
            }
            for(int j = indexOfUpper+1; j < result.length; j++){
                result[j] = Character.toLowerCase(arr[j-1]);
            }
            String newString2;
            newString2 = String.valueOf(result);
            snakeCase[i] = newString2;
        }
        return snakeCase;
    }


    public static void main(String[] args) {
        String[] camelCase = {"stringCamel" , "javaBeginner", "luvCode"};

        String[] snakeCase = snakeCaseConvertV2(camelCase);

        //Результат
        System.out.println(String.join(", ", camelCase));
        System.out.println(String.join(", ", snakeCase));
    }
}
