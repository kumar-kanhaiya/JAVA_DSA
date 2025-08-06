package StacksAndQueues;

public class DynamicQueue  extends CircularQueue{
    public DynamicQueue(){
        super();
    }
    public DynamicQueue(int size){
        super(size);
    }

    @Override
    public boolean insert(int item) {
        if(this.isFull()){
            int[] temp = new int[2*data.length];

            for (int i = 1; i < data.length ; i++) {
                temp[i] = data[(front + i)% data.length];
            }
            front = 0;
            end = data.length;
            data = temp;

        }


        return super.insert(item);
    }
}
