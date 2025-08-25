package BinarySearchInterviewQuestion.DFS;

import java.util.ArrayList;
import java.util.List;

public class Problem297 {

//     * Definition for a binary tree node.
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

      public List<String> serialize(TreeNode node){
        List<String> list = new ArrayList<>();
        helper(node,list);
        return list;
      }
      void helper(TreeNode node , List<String> strings){
            if(node == null){
                strings.add(null);
                return;
            }
            strings.add(String.valueOf(node.val));
            helper(node.left,strings);
            helper(node.right,strings);

      }
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {

    }
}
