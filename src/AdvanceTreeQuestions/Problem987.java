package AdvanceTreeQuestions;

import java.util.*;

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

        Queue< Map.Entry<TreeNode , Integer>> queue = new ArrayDeque<>();

        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        queue.offer(new AbstractMap.SimpleEntry<>(node , coll));
        int min = 0 ;
        int max = 0;

        while(!queue.isEmpty()){
            Map.Entry<TreeNode,Integer> removed = queue.poll();
            node = removed.getKey();
            coll = removed.getValue();

            if(node != null){
                if(!map.containsKey(coll)){
                    map.put(coll , new ArrayList<Integer>());
                }

                map.get(coll).add(node.val);

                min = Math.min(min , coll);
                max = Math.max(max , coll);

                queue.offer(new AbstractMap.SimpleEntry<>(node.left , coll - 1));
                queue.offer(new AbstractMap.SimpleEntry<>(node.right , coll + 1));

            }
        }
        for(int i = min ; i <= max ; i++){
            ans.add(map.get(i));
        }

        return ans;
    }


}
