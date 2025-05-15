package revision;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {3,2,5,4,1};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void bubbleSort(int[] array ){
        boolean check = false;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 1 ; j <= array.length - i - 1 ; j++) {
                if(array[j] < array [ j - 1]){
                    int temp = array[j] ;
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    check = true;
                }
            }
            if(check == false){
                break;
            }

        }
    }
}
