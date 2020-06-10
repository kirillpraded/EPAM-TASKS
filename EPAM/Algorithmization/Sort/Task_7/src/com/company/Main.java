package com.company;

public class Main {
    public static int binarySearch(int[] array, int key){
        //ищем, в какую позицию вставить нужный элемент
        int start = 0;
        int end = array.length-1;
        int mid = (start + end) / 2;
        while (start <= end) {
            mid = (start + end) / 2;
            if(mid != array.length-1) {
                if ((array[mid] >= key) && (array[mid + 1] <= key)) {
                    return mid;
                }
            } else if(array[mid] >= key){return mid;}
            if (array[mid] < key) {
                start = mid + 1;
            } else if (array[mid] > key) {
                end = mid - 1;
            } else if (array[mid] == key) {
                start = mid;
                return mid;
            }
        }
        return mid+1;
    }

    public static void print(int[] array){
        for (int x : array){
            System.out.print(x + " ");
        }
    }

    public static int[] injectArrays(int[] firstArray, int numbToInsert){
        int injectIndex = binarySearch(firstArray, numbToInsert);
        int[] array = new int[firstArray.length+1];
        int j = 0;
        for (int i = 0; i < array.length; i++){
            if(i == injectIndex){
                array[i] = numbToInsert;
            } else{
                array[i] = firstArray[j];
                j++;
            }
        }
        System.out.println("Число " + numbToInsert + " нужно вставить в позицию " + injectIndex);
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,7};
        int[] arrayToInsert = {5,7,6,3,2,4,7};

        for(int x: arrayToInsert){
            array = injectArrays(array, x);
        }
        print(array);
    }
}
