package LinkedList;

public class CustomDubllyLinkedList {

    private Node head ;
    private Node tail;
    private int size;
    private Node pre;

    private class Node{
        int value;
         Node next;
         Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
