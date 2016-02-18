package Arrays;

import Interfaces.ArrayInterface;

/**
 *  * A simple implementation of an ordered array that is searched binarily
 * Created by Dom on 1/21/2016.
 */
public class BinaryOrderedArray implements ArrayInterface{

    //Fields --------------------------------------------------------------------------------------------------------
    private Integer[] a;
    private int numElems = 0;
    private int size;

    //Constructor ---------------------------------------------------------------------------------------------------
    public BinaryOrderedArray(int size) {
        this.a = new Integer[size];
        this.numElems = 0;
        this.size = size;
    }

    //Public Methods ------------------------------------------------------------------------------------------------

    /**
     * Uses binary logic to search for key
     *
     * @param key the value being searched
     * @return index if found, -1 if not
     */
    public int search(int key) {
        //initialize bounds
        int lowerBound = 0;
        int upperBound = numElems - 1;

        int currIdx;
        while (lowerBound <= upperBound) {
            currIdx = (lowerBound + upperBound) / 2;    //bounds are averaged to define a current index
            if (a[currIdx] == key) {    //is value
                return currIdx;
            } else if (a[currIdx] > key) {     // search lower half
                upperBound = currIdx - 1;    //shifts currIdx down
            } else {   //search upper half
                lowerBound = currIdx + 1;     //shifts currIdx up
            }
        }
        System.out.println("Key " + key + " was not found.");
        return -1;  //key does not exist
    }

    /**
     * Inserts a value at appropriate position in array
     *
     * @param key the value being searched
     */
    public void insert(int key) {

        if (numElems >= size) {
            System.out.println("Cannot add " + key + " to array. Array is full.");
            return;     //exit function if full
        }

        int i;
        for (i = 0; i < numElems; i++) {        //locate correct index to insert key
            if (a[i] > key) {
                break;
            }
        }
        for (int j = numElems; j > i; j--) {       //move elements up
            a[j] = a[j - 1];
        }
        a[i] = key;     //set index to key
        System.out.println("Inserted element " + key + " at index " + i + ".");
        numElems++;
    }

    /**
     * Searches for and removes value from array using binary search
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