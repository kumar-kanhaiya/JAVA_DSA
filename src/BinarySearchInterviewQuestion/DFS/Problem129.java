package BinarySearchInterviewQuestion.DFS;

public class Problem129 {

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
    int ans = 0;
    public int sumNumbers(TreeNode root) {
        return helper(root , 0);

    }
    public int helper(TreeNode root ,int sum){
        if(root == null){
            return 0;

        }
        sum = sum*10 + root.val;

        if(root.left == null && root == null){
            return sum;
        }

        return helper(root.left , sum ) + helper(root.right , sum);
    }

}
