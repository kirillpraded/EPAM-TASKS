package com.company;

import java.util.Scanner;

//5 . Сортировка вставками. Дана последовательность чисел
//n a ,a , ,a 1 2 
//. Требуется переставить числа в порядке
//возрастания. Делается это следующим образом. Пусть
//a a ai
//, , , 1 2  - упорядоченная последовательность, т. е.
//a1  a2  an
//.
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
        System.out.println("Добавили " + numbToInsert + " в позицию " + injectIndex);
            print(array);
            return array;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,7};
        Scanner scanner = new Scanner(System.in);
        //если же хотим "слить" два массива в один, можно этот блок
        // обернуть циклом и передавать в функцию i-тый элемент массива
        while(true){
            System.out.println("Введите число, которое хотите вписать в массив, или 0, для выхода из программы");
            int num = scanner.nextInt();
            if (num == 0)break;
            array = injectArrays(array, num);
        }
        scanner.close();
    }
}
