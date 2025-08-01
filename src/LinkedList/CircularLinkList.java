package LinkedList;

public class CircularLinkList {
    private class Node{
        private int val;
        private int next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, int next) {
            this.val = val;
            this.next = next;
        }
    }
}
