package BinarySearchLeetCode_Problems;
//error

public class InfiniteArray {
    public static void main(String[] args) {
    int[] arr = { 2,3,5,6,7,8,10,11,12,15,20,23,30};
    int target = 15;
    System.out.println(findingRange(arr,target));

    }
    static int findingRange(int[] array , int target ){
        // first find the range
        // first start with a box of size 2
        int start = 0 ;
        int end = 1;

        // condition for the target to lie in the range
        while(target > array[end]){
           int newStart = end +1 ;
           // double the box value
           end = end + (end - start + 1) * 2;
           start = newStart;
        }
        return binarySearch(array,target,start , end);
    }
    static int binarySearch(int[] array , int target , int start , int end ) {
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target > array[mid]){
                start = mid+1;
            }
            else if(target < array[mid]){
                end = mid -1 ;
            }
            else{
                // answer found
                return mid;
            }

        }
        return -1 ;

    }


}
