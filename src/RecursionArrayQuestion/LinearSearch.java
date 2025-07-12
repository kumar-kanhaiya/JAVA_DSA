package RecursionArrayQuestion;

public class LinearSearch {
    public static void main(String[] args) {
// find out the indexing of target element in the array using recursion
        int[] array
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
}
