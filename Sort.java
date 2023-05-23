package com.sorting;

public class Sort {
    // changes done in sj branch
    //changes done by test branch

    // Bubble Sort
    void bubbleSort(int[] arr) {
        int n = arr.length;
        int elementPos = n - 1;
        while (elementPos >= 1) {
            int currentPos = 0;
            int swapCount = 0;
            while (currentPos < elementPos) {
                if (arr[currentPos] > arr[currentPos + 1]) {
                    swapCount++;
                    int temp = arr[currentPos];
                    arr[currentPos] = arr[currentPos + 1];
                    arr[currentPos + 1] = temp;
                }
                currentPos = currentPos + 1;
            }
            if (swapCount == 0) {
                return;
            }
            elementPos = elementPos - 1;
        }
    }

    void selectionSort(int[] arr) {
        int n = arr.length;
        int elementPos = 0;
        while (elementPos < n - 1) {
            int smallestElementPos = elementPos;
            int currentPos = elementPos + 1;
            while (currentPos < n) {
                if (arr[currentPos] < arr[smallestElementPos]) {
                    smallestElementPos = currentPos;
                }
                currentPos++;
            }
            if (elementPos != smallestElementPos) {
                int temp = arr[elementPos];
                arr[elementPos] = arr[smallestElementPos];
                arr[smallestElementPos] = temp;
            }
            elementPos++;
        }
    }

    void insertionSort(int[] arr) {
        int sortedSize = 1;
        while (sortedSize < arr.length) {
            int insertElement = arr[sortedSize];
            int currentPos = sortedSize - 1;
            while (currentPos >= 0) {
                if (arr[currentPos] < insertElement) {
                    break;
                }
                if (arr[currentPos] > insertElement) {
                    arr[currentPos + 1] = arr[currentPos];
                    currentPos = currentPos - 1;
                }
            }
            arr[currentPos + 1] = insertElement;
            sortedSize++;
        }
    }

    //QUICK SORT
    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }

    void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pidx = partition(arr, low, high);
            quickSort(arr, low, pidx - 1);
            quickSort(arr, pidx + 1, high);
        }
    }

    
}
