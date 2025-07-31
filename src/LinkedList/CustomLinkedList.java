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
        size++;

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
    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size - 1){
            deleteLast();
        }
        Node pre = get(index -1);
        int val = pre.next.value;
        pre.next = pre.next.next;
        return val;
    }

    public void display(){
        Node temp = head;
        while (temp!= null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index ; i++) {
            node = node.next;
        }
        return node;
    }
    public int deleteLast(){
        if(size <=1){
            return deleteFirst();
        }

        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
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
