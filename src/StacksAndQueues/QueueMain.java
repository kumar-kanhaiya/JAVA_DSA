package StacksAndQueues;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue();
        queue.insert(12);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(5);
        queue.display();
        System.out.println(queue.remove());
        queue.display();
    }
}
