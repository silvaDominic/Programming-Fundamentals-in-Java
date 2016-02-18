package Stacks;

import Interfaces.StackInterface;

/**
 * A simple array stackArray.
 *
 * Created by reclaimer on 2/15/16.
 */
public class ArrayStack<T> implements StackInterface <T> {

    //Fields ---------------------------------------------------------------------------------------------------------

    private T[] stackArray;
    private int size;;
    private int top;
    private final static int DEFAULT_SIZE = 10;

    //Constructors ---------------------------------------------------------------------------------------------------

    /**
     * Default Constructor
     */
    public ArrayStack(){
        this.size = DEFAULT_SIZE;
        this.stackArray = (T[]) new Object[DEFAULT_SIZE];
        top = -1;
    }

    /**
     * Override Constructor
     *
     * @param size The designated getNumOfElems of the array to be used in the stackArray
     */
    public ArrayStack(int size){
        this.size = size;
        this.stackArray = (T[]) new Object[size];
        top = -1;
    }

    //Public Methods -------------------------------------------------------------------------------------------------

    /**
     * Inserts an item into the stackArray.
     *
     * @param item The object to be inserted
     */
    public void push(T item){
        if (top == stackArray.length - 1) {
            System.out.println("Cannot add " + item + ". " + "Stack is full.");
        }
        else{
            stackArray[++top] = item;
        }
    }


    /**
     * Removes the top item from the stackArray.
     *
     * @return the object at the top of the stackArray
     */
    public T pop(){
        T itemToRemove = peek();
        if (itemToRemove == null){
            return null;
        }
        stackArray[top--] = null;
        return itemToRemove;
    }


    /**
     * Returns the top item in the stackArray.
     *
     * @return the top object
     */
    public T peek(){
        if (isEmpty()){
            System.out.println("Cannot complete action. Stack is empty.");
            return null;
        }
        return stackArray[top];
    }


    /**
     * Checks if stack is empty
     *
     * @return true if empty
     */
    public boolean isEmpty(){
        return top == -1;
    }


    /**
     * Checks if stack is full
     *
     * @return true if stack is full
     */
    public boolean isFull(){
        return top == size -1;
    }


    /**
     * Checks for the number of elements in the stack
     *
     * @return the number of elements
     */
    public int getNumOfElems(){
        return top + 1;
    }


    /**
     * Displays contents of stack (used for demonstration only)
     */
    public void displayStack() {
        for (T item : stackArray){
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
