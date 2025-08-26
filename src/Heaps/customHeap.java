package Heaps;

import java.util.ArrayList;

public class  customHeap<T extends Comparable<T>> {


    private ArrayList<T> list;

    public customHeap(){
        list = new ArrayList<>();

    }

    private void swap(int first , int second ){
        T temp = list.get(first);
        list.set(first , list.get(second));
        list.set(second , temp);
    }
}
