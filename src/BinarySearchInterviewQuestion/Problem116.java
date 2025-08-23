package BinarySearchInterviewQuestion;

import java.util.LinkedList;
import java.util.Queue;

public class Problem116 {
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
    public Node connect(Node root) {
        if(root == null){
            return root;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int level = queue.size();
            for (int i = 0; i <level ; i++) {
                Node currentNode = queue.poll();
                queue.add(currentNode.val);
            }
        }
    }

}
