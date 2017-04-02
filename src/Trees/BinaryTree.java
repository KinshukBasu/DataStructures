package Trees;

import static Trees.BinaryTree.mode.INORDER;
import static Trees.BinaryTree.mode.PREORDER;

/**
 * Created by KinshukBasu on 02-Apr-17.
 */
public class BinaryTree {

    Node root;

    public BinaryTree(){
        root = null;
    }

    public enum mode{
        INORDER, PREORDER, POSTORDER
    }

    public void traverse(mode order){

        switch (order){
            case INORDER: this.inOrder(this.root);
                            break;
            case PREORDER: this.preOrder(this.root);
                            break;
            case POSTORDER: this.postOrder(this.root);
                            break;
            default: break;
        }
    }

    public void inOrder(Node node){

        if(node==null){
            return;
        }
        inOrder(node.left);
        node.showData();
        inOrder(node.right);
    }

    public void preOrder(Node node){

        if(node==null){
            return;
        }
        node.showData();
        inOrder(node.left);
        inOrder(node.right);
    }

    public void postOrder(Node node){

        if(node==null){
            return;
        }
        inOrder(node.left);
        inOrder(node.right);
        node.showData();
    }
    
}
