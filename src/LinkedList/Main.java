package LinkedList;

public class Main {
    public static void main(String[] args) {
        CustomDubllyLinkedList list = new CustomDubllyLinkedList();
        list.insertFirst(15);
        list.insertFirst(1);
        list.insertFirst(7);
        list.insertFirst(9);
        list.insertFirst(4);
        list.insertFirst(2);
        list.display();
    }
}
