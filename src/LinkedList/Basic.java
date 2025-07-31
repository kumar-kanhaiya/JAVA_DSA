package LinkedList;



public class Basic {
    public static void main(String[] args) {
    CustomLinkedList list = new CustomLinkedList();
    list.insertFirst(3);
    list.insertFirst(8);
    list.insertFirst(7);
    list.insertFirst(14);
    list.insertFirst(10);
    list.insertLast(99);
    list.insert(100,3);
    System.out.println(list.deleteFirst());
    list.display();
        System.out.println(list.deleteLast());
    list.display();


    }
}
