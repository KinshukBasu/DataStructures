package Stack;

/**
 * Created by KinshukBasu on 01-Apr-17.
 */
public class test {

    public static void main(String args[]){

        MyStack<Integer> a = new MyStack<Integer>(4);
        Integer i;
        a.push(0);
        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        a.push(5);
        System.out.println(a.getSize());
        a.push(6);
        System.out.println(a.getSize());
        a.pop();
        a.pop();
        a.pop();
        a.pop();
        System.out.println(a.getSize());
        a.pop();
        a.pop();
        System.out.println(a.getSize());

    }
}
