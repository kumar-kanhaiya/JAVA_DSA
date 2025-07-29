package OOPS.generics;

import java.util.ArrayList;

public class CustomArraylist {

        private int[] data;
        private static int DEFAULT_SIZE = 10;
        private int size = 0;

        public CustomArraylist(){
            this.data = new int[DEFAULT_SIZE];

        }

        public void add(int num ){
            if(isFull()){
                resize();
            }
            data[size++] = num;
        }

    private void resize() {
            int[] temp = new int[data.length*2];
            // copy the current items in the array
        for (int i = 0; i < data.length ; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
            return size == data.length;
            
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(45);
        list.get(0);
        list.remove(0);
        list.set(1,6585);
        list.size();

    }
}
