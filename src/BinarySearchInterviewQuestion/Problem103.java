package BinarySearchInterviewQuestion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem103 {
//     Definition for a binary tree node.
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
        while(!queue.isEmpty()){
            int level = queue.size();
            List<Integer> customList  = new ArrayList<>(queue.size());
            for (int i = 0; i <level ; i++) {
                TreeNode customNode = queue.poll();
                customList.add(customNode.val);
                if(i%2==0){
                    if(customNode.left != null){
                        queue.offer(customNode.left);
                    }
                    if(customNode.right != null){
                        queue.offer(customNode.right);
                    }
                }
                else{
                    if(customNode.right != null){
                        queue.offer(customNode.right);
                    }
                    if(customNode.left != null){
                        queue.offer(customNode.left);
                    }

                }

            }
            result.add(customList);
        }
        return result;
    }

}
