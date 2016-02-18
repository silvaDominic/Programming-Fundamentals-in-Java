package Arrays;

import Interfaces.ArrayInterface;

/**
 * A simple implementation of an unordered array
 * Created by Dom on 1/8/2016.
 */

public class UnorderedArray implements ArrayInterface {

    //Fields --------------------------------------------------------------------------------------------------------
    private Integer[] a;
    private int numElems = 0;
    private int size;

    //Constructor ---------------------------------------------------------------------------------------------------
    public UnorderedArray(int size) {
        this.a = new Integer[size];
        this.numElems = 0;
        this.size = size;
    }

    //Public Methods ------------------------------------------------------------------------------------------------

    /**
     * Performs linear search
     * Searches for value
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
     * Inserts a value (appends it) at next available position in array
     *
     * @param key the value being searched
     */
    public void insert(int key) {
        if (numElems >= size){
            System.out.println("Cannot add " + key + " to array. Array is full.");
            return;     //exit function if array is full
        }
        a[numElems] = key;      //add key to last available position
        System.out.println("Inserted element " + key + " at index " + numElems + ".");
        numElems++;
    }

    /**
     * Searches for and removes value from array
     *
     * @param key the value being searched
     */
    public void remove(int key) {
        int indexToRemove = search(key);    //calls search to find index of key and assign to variable
        if (indexToRemove == -1){       //if key is not found, exit function
            return;
        }
        for (int j = indexToRemove; j < numElems - 1; j++) {    //move elements down
            a[j] = a[j + 1];
        }

        a[numElems - 1] = null;      //set last element to null
        numElems--;
        System.out.println("Removed element " + key + " at index " + indexToRemove + ".");
    }

    /**
     * Prints array
     */
    public void displayArray(){
        for (int i = 0; i < numElems; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
