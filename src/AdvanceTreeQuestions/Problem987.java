package AdvanceTreeQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Problem987 {

//     * Definition for a binary tree node.
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {

          }
          TreeNode(int val) {
              this.val = val;
          }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }
    public List<List<Integer>> verticalTraversal(TreeNode node) {
        // we are using BFS for this problem
        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        if(node == null){
            return ans;
        }

        int coll = 0;

        Queue< Map.Entry<TreeNode , Integer>

        return ans;
    }


}
