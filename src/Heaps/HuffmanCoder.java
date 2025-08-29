package Heaps;

import java.util.HashMap;

public class HuffmanCoder {
    HashMap<Character , String> encoder;
    HashMap<String , Character> decoder;

    private class Node implements Comparable<Node>{
        Character data ;
        int cost; // frequency
        Node left ;
        Node right;

        public Node(Character data , int cost){
            this.data = data;
            this.cost = cost;
            this.left = null;
            this.right = null;
        }

        @Override
        public int compareTo(Node other) {
            return this.cost - other.cost;
        }
    }
    public HuffmanCoder(String feeder) throws Exception{
        HashMap<Character , Integer> fmap = new HashMap<>();

        for(int i = 0 ; i<feeder.length() ; i++){
            char cc = feeder.charAt(i);
            if(fmap.containsKey(cc)){
                int ov = fmap.get(cc);
                ov += 1 ;
                fmap.put(cc , ov);
            }
            else{
                fmap.put(cc , 1);
            }
        }
    }

}
