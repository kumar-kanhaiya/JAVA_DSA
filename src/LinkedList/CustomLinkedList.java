package LinkedList;

import LinkedList.Problems.problem148;

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

    // insert using recursion !!
    public void insertUsingRecursion(int val , int index){
        head = insertRec(val,index,head);

    }
    private Node insertRec(int val , int index , Node node){
        // base condition
        if(index == 0){
            Node temp = new Node(val , node);
            size++;
            return temp;
        }
        node.next = insertRec(val , index-- , node.next);
        return node;
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
    public void bubbleSort(){
        bubbleSort(size-1 , 0);
    }
    private void bubbleSort(int row , int coll){
        if(row == 0){
            return;
        }
        if(coll < row){
            Node first = get(coll);
            Node second  = get(coll+1);

            if(first.value > second.value){
                // swap
                if(first == head){
                    head = second;
                    first.next = second.next;
                    second.next = first;
                }
                else if(second == tail){

                    Node prev = get(coll -1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                }
                else{
                    Node prev = get(coll -1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, coll + 1);
        }
        else{
            bubbleSort(row-1 , 0);
        }
    }


}
