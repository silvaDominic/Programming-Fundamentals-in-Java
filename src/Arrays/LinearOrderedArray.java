package Arrays;

import Interfaces.ArrayInterface;

/**
 * A simple implementation of an ordered array that is searched linearly
 * Created by Dom on 1/21/2016.
 */
public class LinearOrderedArray implements ArrayInterface {

    //Fields --------------------------------------------------------------------------------------------------------
    private Integer[] a;
    private int numElems = 0;
    private int size;

    //Constructor ---------------------------------------------------------------------------------------------------
    public LinearOrderedArray(int size) {
        this.a = new Integer[size];
        this.numElems = 0;
        this.size = size;
    }

    //Public Methods ------------------------------------------------------------------------------------------------

    /**
     * Performs linear search
     * Searches for key value
     *
     * @param key the value being searched
     * @return index if found, -1 if not
     */
    public int search(int key) {
        for (int i = 0; i < numElems; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        System.out.println("Could not find " + key + ".");
        return -1;
    }

    /**
     * Inserts a value at appropriate position in array
     *
     * @param key the value being searched
     */
    public void insert(int key) {

        if (numElems >= size) {     //check if array is already full
            System.out.println("Cannot add " + key + " to array. Array is full.");
            return;     //exit function if array is full
        }

        int i;
        //adds element to array
        for (i = 0; i < numElems; i++) {
            if (a[i] > key) {
                break;
            }
        }
        //moves elements up one cell
        for (int j = numElems; j > i; j--) {
            a[j] = a[j - 1];
        }
        a[i] = key;     //assign value at index to key
        System.out.println("Inserted element " + key + " at index " + i + ".");
        numElems++;
    }

    /**
     * Searches for and removes value from array
     *
     * @param key the value being searched
     */
    public void remove(int key) {
        int indexToRemove = search(key);    //calls search to find index of key and assigned to variable
        if (indexToRemove == -1) {      //if key is not found, exit function
            return;
        }
        for (int j = indexToRemove; j < numElems - 1; j++) {    //move elements down
            a[j] = a[j + 1];
        }

        a[numElems - 1] = null;    //set last element to null
        numElems--;
        System.out.println("Removed element " + key + " at index " + indexToRemove + ".");
    }

    /**
     * Prints array
     */
    public void displayArray() {
        for (int i = 0; i < numElems; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}