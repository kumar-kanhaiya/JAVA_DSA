package BinarySearchInterviewQuestion.DFS;

import java.util.*;

public class Problem297 {

//     * Definition for a binary tree node.
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

      public List<String> serialize1(TreeNode node){
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

      TreeNode deserialize(List<String> list){
          Collections.reverse(list);
          TreeNode node = helper2(list);
          return node;
      }
      TreeNode helper3(List<String> list){
          String val = list.remove(list.size() - 1);

          if(val.charAt(0) == 'n'){
              return null;
          }
          TreeNode node = new TreeNode(Integer.parseInt(val));
          node.left = helper2(list);
          node.right = helper2(list);
          return node;
      }
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<String> list = new ArrayList<>();
        helper(root, list);
        return String.join(",", list);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        List<String> list = new ArrayList<>(Arrays.asList(data.split(",")));
        return helper2(list);
    }

    private TreeNode helper2(List<String> list) {
        String val = list.remove(0);
        if (val.equals("null")) {
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(val));
        node.left = helper2(list);
        node.right = helper2(list);
        return node;
    }


}
