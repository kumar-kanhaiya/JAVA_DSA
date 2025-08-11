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
        System.out.println(details + node.value);
        display(node.left , "Left child of " + node.value + " : ");
        display(node.right , "Right child of " + node.value + " : ");
    }

    public void insert(int value ){

    }
    private Node insert(int value , Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value < node.value){
            node.left = insert(value , node.left);
        }
        if(value > node.value){
            node.right = insert(value , node.right);
        }

        node.height = Math.max(height(node.left) , height(node.right)) + 1;

        return node;
    }
    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }
}
