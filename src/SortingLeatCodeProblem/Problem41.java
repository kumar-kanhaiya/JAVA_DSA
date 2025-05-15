package SortingLeatCodeProblem;

public class Problem41 {
    public static void main(String[] args) {
        int[] array = {1,2,0};
        System.out.println(firstMissingPositive(array));

    }
    public static int firstMissingPositive(int[] array) {
        int i = 0 ;
        while(i < array.length){
            int correctIndex = array[i] - 1;

            if(array[i] > 0 && array[i]<=array.length && array[i] != array[correctIndex]){
                swap(array , i , correctIndex);
            }
            else{
                i++;
            }
        }

        for(int j = 0 ; j < array.length ; j++){
            if(array[j] != j + 1){
                return j+1;
            }
        }
        return array.length + 1;
    }
    public static void swap(int[] array , int first , int second ){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
