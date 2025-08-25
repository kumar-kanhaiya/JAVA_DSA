package BinarySearchInterviewQuestion.DFS;

public class Problem124 {

//     * Definition for a binary tree node.
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {

          }
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode node) {
        helper(node);
        return ans;
    }
    int helper(TreeNode node ){
        if(node == null){
            return 0;
        }

        int left = helper(node.left);
        int right = helper(node.right);

        left = Math.max(0,left);
        right = Math.max(0,right);

        int pathSum = left + right + node.val;
        ans = Math.max(ans, pathSum);

        return Math.max(left,right) + node.val;
    }

}
