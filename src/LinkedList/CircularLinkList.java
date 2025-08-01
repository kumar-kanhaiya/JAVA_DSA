package LinkedList;

public class CircularLinkList {

    private Node head;
    private Node tail;

    public CircularLinkList(){
        this.head = null;
        this.tail = null;
    }

    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail  = node;
            return;

        }
        tail.next  = node;
        node.next = head;
        tail = node;

    }



    private class Node{
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }


    }
}
