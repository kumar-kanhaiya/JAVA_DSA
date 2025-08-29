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
        public int compareTo(Node o) {
            return 0;
        }
    }

}
