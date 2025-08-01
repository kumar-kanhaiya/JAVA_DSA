package LinkedList;

public class CustomDubllyLinkedList {

    private Node head ;

    private int size;

    public void insertFirst(int value ){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;

    }

   public void insert(int after , int val ){
        Node p = find(after);

        if(p == null){
            System.out.println("does not exist");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next.prev != null ){
            node.next.prev = node;
        }

   }

   public Node find(int index){
        Node node = head;
        while(node != null){
            if(node.value == index){
                return node;
            }
            node = node.next;
        }
        return null;
   }

    public void insertLast(int value){
        Node node = new Node(value);
        Node last = head;
        node.next = null;
        if(head == null){
            node.prev = null;
            head = node;
            return;
        }
        while(last.next!= null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;

    }
//    public void insert(int val , int index){
//        if(index == 0){
//            insertFirst(val);
//            return;
//        }
//        if(index == size){
//            insertLast(val);
//            return;
//        }
//
//        CustomDubllyLinkedList.Node temp = head;
//        for (int i = 1; i < index ; i++) {
//            temp = temp.next;
//        }
//        Node node = new Node(val,temp.next);
//        temp.next = node;
//
//        size++;
//
//    }
    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.println("END");
    }

    public void displayReverse(){
        Node node = head;
        Node last = null;
        while(node != null){
            last = node;
            node = node.next;
        }
        System.out.println("Print in Reverse !! ");
        while(last != null){
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    private class Node{
        int value;
         Node next;
         Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
