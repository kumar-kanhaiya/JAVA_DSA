package SortingAlgo;

public class CountSort {
    public static void main(String[] args) {

    }
    public static void countSort(int[] array ){
        if(array == null || array.length <= 1){
            return;
        }
        int max = maxNumber(array);



    }
    public static int maxNumber(int[] array){
        int max = array[0];
        for(int num : array){
            if(num > max){
                max = num;
            }
        }
        return max;
    }
}
