package BinarySearchInterviewQuestion.DFS;

public class Problem105 {

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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
          if(preorder.length == 0){
              return null;
          }

          int r = preorder[0];
          int index = 0;
        for (int i = 0; i < inorder.length ; i++) {

        }

    }

}