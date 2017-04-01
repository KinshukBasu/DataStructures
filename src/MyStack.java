import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Created by KinshukBasu on 01-Apr-17.
 */
public class MyStack<Item> {

    private Item container[];
    private int top;

    public MyStack(){
        this(10);
    }

    public MyStack(int size){
        this.container = (Item[]) new Object[size];
        this.top = -1;
    }

    public Item pop(){

        if(top==-1){
            throw new EmptyStackException();
        }
        else{
            Item x = container[top];
            container[top] = null;
            --top;
            return(x);
        }
    }

    public Item peek(){
        if(top==-1){
            throw new EmptyStackException();
        }
        else{
            return container[top];
        }
    }



}
