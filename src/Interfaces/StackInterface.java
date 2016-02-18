package Interfaces;

/**
 * Created by reclaimer on 2/15/16.
 */
public interface StackInterface <T> {

    /**
     * Inserts an item into the stackArray.
     *
     * @param item The object to be inserted
     */
    public void push(T item);

    /**
     * Removes the top item from the stackArray.
     *
     * @return the object at the top of the stackArray
     */
    public T pop();

    /**
     * Returns the top item in the stackArray.
     *
     * @return the top object
     */
    public T peek();

    /**
     * Checks if stack is empty
     *
     * @return true if empty
     */
    public boolean isEmpty();

    /**
     * Checks if stack is full
     *
     * @return true if stack is full
     */
    public boolean isFull();

    /**
     * Checks for the number of elements in the stack
     *
     * @return the number of elements
     */
    public int getNumOfElems();

    /**
     * Displays contents of stack (used for demonstration only)
     */
    public void displayStack();
}
