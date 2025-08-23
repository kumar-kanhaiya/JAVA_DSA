package BinarySearchInterviewQuestion;

import java.util.LinkedList;
import java.util.Queue;

public class problem101 {

// * Definition for a binary tree node.
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean check = true;

        while(!queue.isEmpty()){
            int level = queue.size();
            for (int i = 0; i <level ; i++) {
                TreeNode currentNode = queue.poll();
                if(currentNode.left != currentNode.right){
                    check = false;
                }
                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
        }
        return check;
    }
}
