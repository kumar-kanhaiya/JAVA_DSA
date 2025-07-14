package RecursionPatternQuestions;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
    int[] array = {8,3,4,12,5,6};
    sorting(array , (array.length - 1)/2 , 0  );
    sorting(array , array.length - 1, (array.length - 1)/2 + 1  );
        System.out.println(Arrays.toString(array));
    }
    public static void sorting(int[] array , int row , int collom){
        if(row == 0){
            return;
        }
        if(row > collom){
            if(array[collom] > array[collom+1]){
                swap(array , collom ,collom + 1);
            }
            sorting(array,row,collom + 1);
        }
        else{
            sorting(array,row - 1 ,0);
        }
    }
    public static void swap(int[] array , int first , int second ){
        int temp = array[first];
        array[first] =array[second];
        array[second] = temp;
    }
}
