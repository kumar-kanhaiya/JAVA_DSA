package BinarySearchInterviewQuestion.DFS;

import BinarySearchInterviewQuestion.problem101;

public class Problem543 {

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

      // DFS is used in this problem
      int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root){
        height(root);
        return diameter;
    }


    public int height(TreeNode node){
        if(node == null){
            return 0;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);


        return Math.max(leftHeight,rightHeight) + 1;
    }

}
