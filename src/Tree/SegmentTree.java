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
    private Node constructTree(int[] array , int start , int end){
         if(start == end){
             Node leaf = new Node(start , end);
             leaf.data = array[start];
             return leaf;
         }

         // create a Node with index you are at
        Node node = new Node(start , end );

         int mid = (start + end)/2;

        node.left = this.constructTree(array ,start , mid);
        node.right = this.constructTree(array , mid+1 , end);

        // condition for return


         node.data = node.left.data + node.right.data;
         return node;

    }

    public void display(){
        display(this.root);
    }
    private void display(Node node){
        String str = "";

        if(node.left != null){
            str = str + "Interval=[" + node.left.startInterval + "-" + node.left.endInterval + "] and data: " +
                    node.left.data + "=>";
        }
        else{
            str =  str + "No left child";
        }

        // for current node
        str = str + "Interval=[" + node.startInterval + "-" + node.endInterval + "] and data: " +
                node.data + "=>";
        if(node.right != null){
            str = str + "Interval=[" + node.right.startInterval + "-" + node.right.endInterval + "] and data: " + node.right.data;
        }
        else{
            str = str + "No right Child";
        }
    }

}
