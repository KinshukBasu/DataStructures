package Stack;

/**
 * Created by KinshukBasu on 01-Apr-17.
 */
public interface Stack<Item> extends Iterable<Item> {

    Item peek(); // return the top item without removing it from stack
    Item pop(); // return the top item and removes it from stack
    //void push(Item x); // adds an item to the stack
    boolean isEmpty(); // returns true if stack is empty, false otherwise
    int getSize();  // returns the number of items in stack right now

}
