package SortingAlgorithms;

import Utils.ArrayUtil;

/**
 * A simple demo of 3 fundamental sorting algorithms.
 * Created by Dom on 1/23/2016.
 */

public class SortingAlgorithmDemo {
    public static void main(String[] args) {

        //Create arrays
        int[] a = {23, 56, 8, 99, 45, 67, 34, 23, 87, 88};
        int[] b = {99, 3, 5, 45, 6, 89, 44, 44, 25, 234};
        int[] c = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        //Bubble Sort
        System.out.println("Bubble Sort: ");
        int[] A = ArrayUtil.bubbleSort(a);
        ArrayUtil.displayArray(a);
        ArrayUtil.displayArray(A);

        //Selection Sort
        System.out.println("Selection Sort: ");
        int[] B = ArrayUtil.selectSort(b);
        ArrayUtil.displayArray(b);
        ArrayUtil.displayArray(B);

        //Insertion Sort
        System.out.println("Insertion Sort: ");
        int[] C = ArrayUtil.insertionSort(c);
        ArrayUtil.displayArray(c);
        ArrayUtil.displayArray(C);
    }
}