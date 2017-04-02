package Queue;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by KinshukBasu on 01-Apr-17.
 */
public class MyQueue<Item> implements Queue<Item> {

    private class Node{
        Item data;
        Node next;

        public Node(){
            this.data = null;
            next = null;
        }

        public Node(Item data){
            this.data = data;
            next = null;
        }
        
    }

    private Node front, rear;
    private int size;

    public MyQueue(){
        front = null;
        rear = null;
        size = 0;
    }


    public boolean isEmpty() {
        return (size==0);
    }


    public int size() {
        return size;
    }

    public Item delete() {
        Item temp;
        if(this.isEmpty()){
            return null;
        }
        else{
            temp = front.data;
            front = front.next;
            --size;
            if(isEmpty()){
                rear = null;
            }
            return temp;
        }
    }

    public void insert(Item itm){

        Node oldrear = rear;
        rear = new Node(itm);
        if(isEmpty()){
            front=rear;
        }
        oldrear.next = rear;
        ++size;
    }

    public Iterator iterator(){
        return new MyQueueIterator();
    }

    private class MyQueueIterator implements Iterator<Item>{

        private int i = size;
        private Node curr = front;




        public boolean hasNext() {
            return(i>0);
        }

        public Item next(){
            Item temp = curr.data;
            curr = curr.next;
            --i;
            return(temp);

        }
    }

}
