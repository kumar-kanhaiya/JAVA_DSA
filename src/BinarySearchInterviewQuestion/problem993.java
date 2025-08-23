package BinarySearchInterviewQuestion;

import java.util.LinkedList;
import java.util.Queue;

public class problem993 {
//     * Definition for a binary tree node.
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

    public boolean isCousins(TreeNode root, int x, int y) {
        // BFS algo
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean checkX = false;
        boolean checkY = false;

        while(!queue.isEmpty()){
            int level = queue.size();

            for (int i = 0; i < level; i++) {
                TreeNode currentNode = queue.poll();
                if(currentNode.val == x){
                    checkX = true;
                }
                if(currentNode.val == y){
                    checkY = true;
                }
                if(currentNode.left != null) {
                    queue.offer(currentNode.left);

                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }

                if(checkX == true && checkY == true){
                    return true;
                }

            }
        }
        return false;
    }

}
