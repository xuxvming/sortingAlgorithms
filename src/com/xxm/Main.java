package com.xxm;

public class Main {

    public static void main(String[] args) {

        int[] arr = {10,15,5,100,20,50};

        MergeSort ms = new MergeSort();
        ms.mergeSort(arr,0,arr.length-1);
        for(int i = 0 ; i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
