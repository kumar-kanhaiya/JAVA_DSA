package BinarySearchInterviewQuestion;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

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
        Deque<TreeNode> queue = new LinkedList<>();

        boolean reverse = false;
        queue.offer(root);
        while(!queue.isEmpty()){
            int level = queue.size();
            List<Integer> currentLevel = new ArrayList<>(queue.size());
            for(int i = 0 ; i< level ; i++) {


                if (!reverse) {
                    TreeNode currentNode = queue.pollFirst();
                    currentLevel.add(currentNode.val);
                    if (currentNode.left != null) {
                        queue.addLast(currentNode.left);

                    }
                    if (currentNode.right != null) {
                        queue.addLast(currentNode.right);
                    }


                } else {
                    TreeNode currentNode = queue.pollLast();
                    currentLevel.add(currentNode.val);

                    if (currentNode.right != null) {
                        queue.addFirst(currentNode.right);
                    }
                    if (currentNode.left != null) {
                        queue.addFirst(currentNode.left);

                    }
                }
            }

            reverse = !reverse;
            result.add(0,currentLevel);

        }
        return result;

    }
}
