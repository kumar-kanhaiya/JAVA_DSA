package AdvanceTreeQuestions;

import java.util.HashMap;

public class Problem105 {
    public static void main(String[] args) {

    }


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
      static int index = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for (int i = 0; i < inorder.length ; i++) {
            map.put(inorder[i] , i );
        }

        return helper(preorder , inorder , 0 , preorder.length - 1 , map);
    }
    public TreeNode helper(int[] preorder , int[] inorder , int left , int right ,
                           HashMap<Integer , Integer>  map){
        if(left > right){
            return null;
        }

        int current = preorder[index];
        index++;

        TreeNode node = new TreeNode(current);

        if(left == right){
            return node;
        }

        node.left = helper(preorder , inorder , left , index - 1 , map);
        node.right = helper(preorder , inorder , index+ 1 , right , map);

        return node;
    }

}
