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

    private int parent(int index){
        return index/2;

    }

    private int right(int index ){
        return index * 2 + 2;
    }
    private int left(int index){
        return index* 2 + 1;
    }

    public void insert(T value){
        list.add(value);
        upheap(list.size() - 1);

    }

    private void  upheap(int index){
        if(index == 0){
            return;
        }

        int p = parent(index);
        if(list.get(index).compareTo(list.get(p)) < 0){
            swap(index , p);
            upheap(p);
        }

    }
    public T remove() throws Exception{
        if(list.isEmpty()){
            throw new Exception("Removing from an empty heap  ");
        }
        T temp = list.get(0);

        T last = list.remove(list.size() - 1);
        if(!list.isEmpty()){
            list.set(0,last);
            downheap(0);
        }
        return temp;
    }
}
