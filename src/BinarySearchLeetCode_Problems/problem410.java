package BinarySearchLeetCode_Problems;

public class problem410 {
    public static void main(String[] args) {
        int[] array = {1,4,4};
        int target = 3;
        System.out.println(answer(array,target));
    }
    public static int answer(int[] array , int target ){
        int sum1 = maximumSum(array, 0 , target);
        int sum2 = maximumSum(array,target+1 , array.length-1);
        if(sum1> sum2){
            return sum1;
        }
        else{
            return sum2;
        }
    }
    public static int maximumSum(int[] array ,  int start , int end ){
        if(array.length < end){
            return 0;
        }
        int sum = 0 ;
        while(start <= end ){
            sum += array[start];
            start++;
        }
        return sum ;
    }
}
