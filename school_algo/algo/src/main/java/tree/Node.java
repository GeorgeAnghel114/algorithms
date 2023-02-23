package tree;

public class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }

    public void printLeafNodes(Node node){
        if(node == null){
            return;
        }

        if(node.left == null && node.right == null){
            System.out.printf("%d ", node.value);

        }

        printLeafNodes(node.left);
        printLeafNodes(node.right);
    }


}
