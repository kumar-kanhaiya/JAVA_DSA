package Tree;

import java.util.Scanner;

public class BinaryTree {

    public BinaryTree(){

    }
    private static class Node{
        private int value ;
        Node left;
        Node right;

        public Node(int value ){
            this.value = value;
        }
    }

    private Node root ;
    // insert element
    public void populate(Scanner scanner){
        System.out.println("Enter the root Node value : ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }
    private void populate(Scanner scanner , Node node){

    }
}
