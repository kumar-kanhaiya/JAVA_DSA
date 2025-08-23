package BinarySearchInterviewQuestion;

import java.util.LinkedList;
import java.util.Queue;

public class problem993 {
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

    public boolean isCousins(TreeNode root, int x, int y) {
        // BFS algo
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean checkX = false;
        boolean checkY = false;

        while(!queue.isEmpty()){
            int level = queue.size();

            for (int i = 0; i < level; i++) {
                TreeNode currentNode = queue.poll();
                if(currentNode.val == x){
                    checkX = true;
                }
                if(currentNode.val == y){
                    checkY = true;
                }
                if(currentNode.left != null) {
                    queue.offer(currentNode.left);

                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
                if(currentNode.left != null && currentNode.right != null){
                    if((currentNode.left.val == x && currentNode.right.val == y) ||
                            (currentNode.left.val == y && currentNode.right.val == x)){
                        return false;  // same parent → not cousins
                    }
                }


                if(checkX == true && checkY == true){
                    return true;
                }

            }
            checkX = false;
            checkY = false;
        }
        return false;
    }

    // Second Approach

    public boolean isCousins2(TreeNode root , int x , int y ){
          TreeNode xx = findNode(root, x);
          TreeNode yy = findNode(root, y);

          return ((level(root,xx,0) == level(root,yy,0)) && (!isSibling(root,xx,yy)));

    }

    public TreeNode findNode(TreeNode node , int x){
          if(node == null){
              return null;
          }

          if(node.val == x){
              return node;
          }
        TreeNode n = findNode(node.left , x);
          if(n!= null){
              return n;
          }

          return findNode(node.right , x);

    }

    public boolean isSibling(TreeNode node , TreeNode x , TreeNode y){
          if(node == null){
              return false;
          }
          return((node.left == x && node.right == y) || (node.left == y && node.right == x) || isSibling(node.left , x , y ) || isSibling(node.right , x, y));
      }


      public int level(TreeNode node , TreeNode x , int level ){
          if(node == null){
              return 0;
          }

          if(node == x){
              return level;
          }
          int l = level(node.left , x , level + 1);
          if(l != 0){
              return l;
          }
          return level(node.right , x , level + 1);

      }

}
