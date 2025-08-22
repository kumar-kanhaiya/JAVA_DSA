package BinarySearchInterviewQuestion;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class problem637 {

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

    public static List<Double> averageOfLevels(TreeNode root) {
          List<Double> result = new ArrayList<>();

          if(root == null){
              return result;
          }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int level = queue.size();
            double average = 0;

            for (int i = 0; i < level ; i++) {
                TreeNode currentNode = queue.poll();
                average += currentNode.val;
                if(currentNode.left != null){
                    average += currentNode.left.val;
                }
                if(currentNode.right != null){
                    average += currentNode.right.val;
                }
            }
            result.add(average);
        }

        return result;
    }


}
