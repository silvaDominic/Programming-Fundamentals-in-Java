package Utils;

/**
 * A simple array utility class.
 * Created by Dom on 2/2/2016.
 */
public class ArrayUtil {

    //Public Methods -------------------------------------------------------------------------------------------------

    /**
     * Sorts elements from least to greatest using bubble sort technique
     *
     * @param arr the array of integers to be processed
     */
    public static int[] bubbleSort(int[] arr) {
        //create copy of array
        arr = cloneArray(arr);

        int unsortedElems = arr.length;
        while (unsortedElems >= 0) {
            for (int i = 0; i < unsortedElems - 1; i++) {
                if (arr[i] > arr[i + 1]) {      //compares value at current index to value at next index; swap if true
                    swap(arr, i, i + 1);
                }
            }
            unsortedElems--;
        }
        return arr;
    }


    /**
     * Sorts elements from least to greatest using selection sort technique
     *
     * @param arr the array of integers to be processed
     */
    public static int[] selectSort(int[] arr) {
        //create copy of array
        arr = cloneArray(arr);

        int numElems = arr.length;
        int out, in, min, temp;
        for (out = 0; out < numElems - 1; out++) {
            min = out;      //track index of minimum value; start at left most index
            for (in = out + 1; in < numElems; in++) {
                if (arr[in] < arr[min])     //reassign minimum value if lower value found
                    min = in;
            }
            swap(arr, out, min);
        }
        return arr;
    }

    /**
     * Sorts elements from least to greatest using insertion technique
     *
     * @param arr the array of integers to be processed
     */
    public static int[] insertionSort(int[] arr) {
        //create copy of array
        arr = cloneArray(arr);

        int numElems = arr.length;
        int unsortedElem, in;
        for (int out = 1; out < numElems; out++) {
            unsortedElem = arr[out];  //store first value of unsorted portion of array
            in = out;
            while (in > 0 && arr[in - 1] >= unsortedElem) {     //compares temp value with values from sorted portion of array
                arr[in] = arr[in - 1];      //move elements up
                in--;
            }
            arr[in] = unsortedElem;      //insert element
        }
        return arr;
    }

    /**
     * Creates a copy of an array
     *
     * @param arr, Array to be copied
     * @return copied array
     */
    public static int[] cloneArray(int[] arr){
        int[] copy = new int[arr.length];
        System.arraycopy(arr, 0, copy, 0, copy.length);
        return copy;
    }

    /**
     * Prints array
     *
     * @param arr the array of integers to be processed
     */
    public static void displayArray(int[] arr) {
        int numElems = arr.length;
        for (int i = 0; i < numElems; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Private Methods ------------------------------------------------------------------------------------------------

    /**
     *
     * @param arr, Array being modified
     * @param index1, Index 1
     * @param index2, Index 2
     */
    private static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
