package Heaps;

public class Main {
    public static void main(String[] args) throws Exception {
        customHeap<Integer> heap = new customHeap<>();

        heap.insert(35);
        heap.insert(15);
        heap.insert(18);
        heap.insert(23);
        heap.insert(42);
        heap.insert(11);
        heap.insert(9);
        heap.insert(88);
        heap.insert(46);

        System.out.println(heap.remove());
    }

}
