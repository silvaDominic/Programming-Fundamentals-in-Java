package Stacks;
import Interfaces.StackInterface;

/**
 * A simple demo demonstrating the functional capabilities of a stack.
 *
 * Created by reclaimer on 2/15/16.
 */
public class StackDemo {

    public static void main(String[] args) {
        //Create stack
        int stackSize = 20;
        StackInterface stk = new ArrayStack(stackSize);

        //Try operating on an empty stack
        stk.pop();
        stk.peek();
        System.out.println();


        //Fill stack if empty
        if (stk.isEmpty()) {
            int item = 0;
            for (int i = 0; i < stackSize; i++) {
                System.out.println("Pushing item to index " + stk.getNumOfElems());
                stk.push(item);
                item += 10;
            }
            System.out.println();
        }

        //Print initial stack
        stk.displayStack();

        //Try to push item to full stack
        System.out.println("Pushing item to index " + stk.getNumOfElems());
        stk.push(100);
        System.out.println();

        //Peek at top element
        System.out.println("Peeking at item " + stk.peek() + "\n");

        //Empty stack if full
        if (stk.isFull()){
            for (int i = stackSize; i > 0; i--){
                System.out.println("Removing item " + stk.pop());
            }
        }

        //Print modified stack
        stk.displayStack();
    }
}