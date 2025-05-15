package SortingLeatCodeProblem;

public class Problem287 {
    public static void main(String[] args) {
        int[] array = {1,3,4,2,2};
        System.out.println(findDuplicate(array));

    }
    public static  int findDuplicate(int[] array ) {
        int i = 0;
        while(i< array.length){
            int correctIndex = array[i] - 1 ;
            if(i< array.length && array[i] != array[correctIndex]){
                swap(array,i,correctIndex);
            }
            else{
                i++;
            }

        }
        for (int index = 0; index < array.length; index++) {
            if(array[index] != index +1 ){
                return array[index];
            }

        }
        return -1;
    }
    public static void swap(int[] array , int first , int second ){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

}
