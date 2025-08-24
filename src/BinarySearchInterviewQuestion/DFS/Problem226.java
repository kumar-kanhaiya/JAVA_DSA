package BinarySearchInterviewQuestion.DFS;

public class Problem226 {

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

    public TreeNode invertTree(TreeNode root) {
          if(root == null){
              return null;
          }

          TreeNode leftNode = invertTree(root.left);
          TreeNode rightNode = invertTree(root.right);
            root.left = rightNode;
          root.right = leftNode;

          return root;
    }
}
