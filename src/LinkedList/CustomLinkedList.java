package LinkedList;

public class CustomLinkedList {

    private Node head;
    private Node tail;

    private int size;

    public  CustomLinkedList(){
        this.size = 0;
    }

    public void insert(int val , int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index ; i++) {
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;

        size++;

    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

    }
    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;

    }

    public void display(){
        Node temp = head;
        while (temp!= null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private  class Node{
        private int value ;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }


}
