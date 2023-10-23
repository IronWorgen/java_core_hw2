package org.example;

public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println(countEvens(new int[]{2, 1, 2, 3, 4}));
        //task2
        System.out.println(def(new int[]{7, 6, 3, 4, 1}));
        //task3
        System.out.println(doubleNull(new int[]{0, 0, 1, 1, 0}));
    }

    /**
     * task1
     * Написать метод, возвращающий количество чётных элементов массива.
     * countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
     */
    public  static  int countEvens(int[] arr){
        int counter=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                counter++;
            }
        }
        return counter;
    }

    /**
     * Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого массива.
     */
    public static  int def(int [] arr){
        int min;
        int max;
        if (arr[0]>arr[1]){
            min = arr[1];
            max = arr[0];
        }else {
            min = arr[0];
            max = arr[1];
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        return  max-min;
    }

    /**
     * Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
     */

    public static  boolean doubleNull(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==arr[i+1]&&arr[i]==0){
                return true;
            }
        }
        return  false;
    }


}