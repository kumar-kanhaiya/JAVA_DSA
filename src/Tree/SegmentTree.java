package Tree;

public class SegmentTree {
    public SegmentTree(){

    }
    public static void main(String[] args) {

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
        Node root;


    }

}
