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
        return diameter - 1;
    }


    public int height(TreeNode node){
        if(node == null){
            return 0;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        int dia = leftHeight  + rightHeight + 1;
        diameter = Math.max(diameter , dia);

        return Math.max(leftHeight,rightHeight) + 1;
    }

}
