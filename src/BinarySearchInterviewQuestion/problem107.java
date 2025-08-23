package BinarySearchInterviewQuestion;

import com.sun.source.tree.Tree;

import java.util.*;

public class problem107 {

//      Definition for a binary tree node.
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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int level = queue.size();
            List<Integer> customList = new ArrayList<>();

            for(int i= 0 ; i< level ; i++) {


                TreeNode currentNode = queue.poll();
                customList.add(currentNode.val);
                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }

            }
            result.add(0,customList);
        }
        return result;

    }
}
