package Stack;

import java.util.Arrays;
import java.util.EmptyStackException;

import static java.lang.Integer.max;

/**
 * Created by KinshukBasu on 01-Apr-17.
 */
//Generic implementation of Stack in Java
//TODO Implement iterator

public class MyStack<Item>{

    private Item container[];
    private int top;
    private static final int DEFAULT_SIZE = 10;
    private static final int MIN_SIZE = 3;
    private static boolean DEBUG = false;

    public MyStack(){
        this(DEFAULT_SIZE);
    }

    public MyStack(int size){
        this.container = (Item[]) new Object[size];
        this.top = -1;
    }

    private enum sizeParam{
        INCREASE, DECREASE
    }

    public boolean isEmpty(){
        return((top==-1));
    }

    public int getSize(){
        return(container.length);
    }

    public Item pop(){

        if(top==-1){
            throw new EmptyStackException();
        }
        else{
            Item x = container[top];
            container[top] = null;
            --top;
            if(top< 0.25*container.length){
                resize(sizeParam.DECREASE);
            }
            return(x);
        }
    }

    public Item peek(){
        if(top==-1){
            return null;
        }
        else{
            return container[top];
        }
    }

    public void push(Item x){

        if(top==container.length-1){
            resize(sizeParam.INCREASE);
        }
        ++top;
        container[top]=x;

        if(DEBUG){
            System.out.println("Pushed "+x+", top= "+top);
        }

        return;
    }

    private void resize(sizeParam mode){

        Item temp[];

        if(DEBUG) {
            System.out.println("Inside resize() subroutine");
        }

        if(mode==sizeParam.INCREASE){
           temp = (Item[]) new Object[(int)(1.5*container.length)];
        }
        else if(mode==sizeParam.DECREASE){
            int newsize = max((int)(0.5*container.length), MIN_SIZE);
            temp = (Item[]) new Object[newsize];
        }
        else{
            temp = (Item[]) new Object[DEFAULT_SIZE];
        }

        for(int i=0;i<=top;i++){
            temp[i]=container[i];
        }
        container=temp;

    }





}
