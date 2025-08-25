package BinarySearchInterviewQuestion.DFS;

public class Problem112 {

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
      int sum = 0;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }

        if(root.val == sum && root.left == null && root.right == null){
            return true;
        }

        return hasPathSum(root.left , targetSum  - root.val )|| hasPathSum(root.right ,
                targetSum - root.val);


    }
}
