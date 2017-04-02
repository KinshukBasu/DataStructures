package Trees;

/**
 * Created by KinshukBasu on 02-Apr-17.
 */
public class Node <Item> {

    Item data;
    Node left, right;

    public Node(Item itm){
        this.data = itm;
        this.left = null;
        this.right = null;
    }

    public void showData(){
        System.out.println("Hi, this is node: "+ data);
    }


}
