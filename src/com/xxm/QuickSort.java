package com.xxm;

public class QuickSort {
    public int partitaion(int[] arr, int start, int end){
        /*choosing a pivot and put all the elements smaller than the pivot to left
        and bigger elements to the right
         */
        int pivot = arr[end];
        //iterate the array in the range (start,end] partitation 一般初始化成一个负数
        int j = (start -1);
        for (int i = start; i< end-1;i++){
            if(arr[i] <= pivot){
               j ++;
               swap(arr,i, j);
            }
        }
        //到此为止，所有小于pivot的元素都被放在了左边， 交换j +1 和end 因为此时j+1 是比end大的
        swap(arr,j+1,end);
        return j+1;
    }
    public void quickSort(int[] arr, int start, int end){

        if(start<end){
            int pivot = partitaion(arr,start,end);
            quickSort(arr,start,pivot-1);
            quickSort(arr,pivot+1,end);
        }
    }
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp;

    }
}
