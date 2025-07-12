package RecursionArrayQuestion;

public class LinearSearch {
    public static void main(String[] args) {
// find out the indexing of target element in the array using recursion
        int[] array = {3,2,1,18,9};
        System.out.println(check(array , 188 , 0));
    }
    public static int check(int[] array , int target , int start){
        if(start > array.length - 1){
            // ans not found
            return -1;
        }
        // ans found
        if(array[start] == target){
            return start;
        }
        return check(array,target , start + 1);
    }
    // second approach
    public static boolean check2(int[] array , int target , int start){
        if(start > array.length -1 ){
            return false ;
        }
        return (array[start] == target) || check2(array , target , start + 1);
    }
}
