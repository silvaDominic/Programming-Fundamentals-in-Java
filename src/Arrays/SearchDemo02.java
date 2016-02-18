package Arrays;

import Interfaces.ArrayInterface;

/**
 * Created by Dom on 1/22/2016.
 */
public class SearchDemo02 {
    public static void main(String[] args) {

        //Ordered-Linear Search--------------------------------------------------------------------------------------

        //create array
        int arraySize = 50;
        ArrayInterface arr = new LinearOrderedArray(arraySize);


        //Fill array to max capacity
        int key = 0;
        for (int i = 0; i < arraySize; i++){
            arr.insert(key);
            key += 10;
        }
        System.out.println();

        //Print initial array
        arr.displayArray();
        System.out.println();

        //Search first, middle, and last values
        System.out.println("Search first index, Success: " + (0 == arr.search(0)));
        System.out.println("Search middle index, Success: " + (arraySize / 2 == arr.search(250)));
        System.out.println("Search last index, Success: " + (arraySize - 1 == arr.search(490)));
        System.out.println();

        //Attempt to add more values then capacity
        arr.insert(500);
        arr.insert(510);
        System.out.println();

        //Remove first, middle, and last values
        arr.remove(0);
        arr.remove(250);
        arr.remove(490);
        System.out.println();

        //Print modified array
        arr.displayArray();
        System.out.println();

        //Insert previously removed elements
        arr.insert(0);
        arr.insert(250);
        arr.insert(490);
        System.out.println();

        //Print modified array
        arr.displayArray();
        System.out.println();
    }
}
