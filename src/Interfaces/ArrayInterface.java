package Interfaces;

/**
 * Simple array interface
 * Created by Dom on 1/21/2016.
 */
public interface ArrayInterface {

    /**
     * Inserts a value at a position in the array
     *
     * @param key the value being searched
     */
    public void insert(int key);

    /**
     * Searches for and removes value from array
     *
     * @param key the value being searched
     */
    public void remove(int key);

    /**
     * Searches for key value
     *
     * @param key the value being searched
     * @return index if found, -1 if not
     */
    public int search(int key);

    /**
     * Prints array
     */
    public void displayArray();
}
