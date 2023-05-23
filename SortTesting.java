package com.sorting;


public static void main(String[] args) {
    int[] arr1 = {88, 1, 34, 5, 0, 45, 43, 76, 50, 87};
    Sort bs = new Sort();
//        bs.bubbleSort(arr1);
//        bs.selectionSort(arr1);
//        bs.insertionSort(arr1);
    bs.quickSort(arr1,0, arr1.length-1);

    for (int a : arr1
    ) {
        System.out.println(a);
    }
}