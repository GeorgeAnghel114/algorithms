package tree;

import java.sql.SQLOutput;

public class BinaryTree {
    Node root;

    private Node addRecursive(Node current, int value){
        if(current == null){
            return new Node(value);
        }
        if(value<current.value){
            current.left = addRecursive(current.left,value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right,value);
        }else{
            //value already exists
            return current;
        }
        return current;
    }
    public void add(int value){
        root = addRecursive(root,value);
    }



    public static BinaryTree createBinaryTree(){
        BinaryTree bt = new BinaryTree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        return bt;
    }

    // find an element
    private boolean containsNodeRecursive(Node current, int value){
        if(current == null){
            return false;
        }
        if(value == current.value){
            return true;
        }

        return value < current.value
                ? containsNodeRecursive(current.left,value)
                : containsNodeRecursive(current.right,value);
    }

    public boolean containsNode(int value){
        return containsNodeRecursive(root,value);
    }

    //deleting an element
    //a node has no child => replace the node with null
    //a node has exactly one child - in the parent node we replace this node with its only child
    //a node has two children
    public Node deleteRecursive(Node current, int value){
        if(current == null){
            return null;
        }

        if(value == current.value){
            // node has no child
            if(current.left == null && current.right == null){
                return null;
            }
            //node has one child

            if(current.right == null){
                return current.left;
            }
            if(current.left == null){
                return current.right;
            }
            //node has two children

            int smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = deleteRecursive(current.right,smallestValue);
            return current;

        }

        if(value < current.value){
            current.left = deleteRecursive(current.left,value);
            return current;
        }

        current.right = deleteRecursive(current.right,value);
        return current;
    }

    //node has two children
    //find the node that will replace the deleted node
    // use the smallest node of the soon to be deleted node's right sub-tree
    public int findSmallestValue(Node root){
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

    // public method that starts deletion from the root
    public void delete(int value){
        root = deleteRecursive(root,value);
    }

    //traversing the tree
    //The in-order traversal consists of first visiting the
    // left sub-tree, then the root node,
    // and finally the right sub-tree

    public  static void traverseInOrder(Node node){
        if(node != null){
            traverseInOrder(node.left);
            System.out.println(" "+ node.value);
            traverseInOrder(node.right);
        }
    }
    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }
}
