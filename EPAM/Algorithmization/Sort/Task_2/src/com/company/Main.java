package com.company;
//Даны две последовательности
//a1 <= a2 ...<= an и b1 <= b2 ...<= bm
//. Образовать из них новую последовательность
//чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать
public class Main {
    // самый простой вариант  - просто объединить две последовательности в одну, а потом отсортировать конечную
    //последовательность по возрастанию
    //это самый простой вариант, но он ресурсоёмкий. можно сделать иначе.



    public static int[] concatenateArrays(int[] firstArray, int[] secondArray){
        int[] resultArray = new int[firstArray.length + secondArray.length];
        int j = 0;
        for(int i = 0; i < resultArray.length; i++) {
            if (i < firstArray.length) {
                resultArray[i] = firstArray[i];
            } else {
                resultArray[i] = secondArray[j];
                j++;
            }
        }
        return resultArray;
    }
    
    public static void print(int[] array){
        System.out.println();
        for (int num : array){
            System.out.print(num + " ");
        }
    }

    public static int[] bubbleSort(int[] array){
        for(int i = array.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( array[j] > array[j+1] ){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
	    //первая последовательность
        int[] firstArray = {2,5,8,9,12};
        //вторая последовательность
        int[] secondArray = {1, 2,3,4,6,7};
        int[] newSortedArray = bubbleSort(concatenateArrays(firstArray, secondArray));
        print(newSortedArray);
    }
}
