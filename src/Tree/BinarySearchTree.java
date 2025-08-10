package Tree;

public class BinarySearchTree {
    public class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;


        public Node(int value) {
            this.value = value;
        }
        public int getValue(){
            return value;
        }

    }
    private Node root;

    public BinarySearchTree(){

    }
    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        if(root == null){
            return true;
        }
        return false;
    }

    public void display(){
        display(root , "Root Node: ");
    }
    private void display(Node node , String details){
        if(node == null){
            return;
        }
        System.out.println(details + node.getValue());
        display(node.left , "Left child of " + node.getValue() + " : ");
        display(node.right , "Right child of " + node.getValue() + " : ");
    }
}
