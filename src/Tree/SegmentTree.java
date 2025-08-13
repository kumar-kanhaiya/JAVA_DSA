package Tree;

public class SegmentTree {
    public SegmentTree(){

    }
    public static void main(String[] args) {
        int[] array = {3,8,6,7,-2,-8,4,9};
        SegmentTree tree = new SegmentTree(array);

    }
    static class Node{
        int data;
        int startInterval ;
        int endInterval;
        Node left ;
        Node right ;


        public Node(int startInterval , int endInterval){
            this.startInterval = startInterval;
            this.endInterval = endInterval;

        }
    }
    Node root;
    public SegmentTree(int[] array ){
        // creating the tree by using this array
        this.root = constructTree(array, 0 , array.length - 1);
    }
    public Node constructTree(int[] array , int startInterval , int endInterval){

    }

}
