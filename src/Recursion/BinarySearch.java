package Recursion;
// binary search using recursion .....

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        int end = array.length - 1;
        System.out.println(binarySearch2(array,8,0, end));

    }
    static int binarySearch(int[] arr , int target , int start , int end ){
        if(start > end){
            // ans not found
            return -1 ;
        }
        int mid = start + (end - start)/2;
        if(arr[mid] > target){
            end = mid - 1 ;
        }
        else if(arr[mid] < target){
            start = mid + 1 ;
        }
        else{
            // ans found
            return mid ;
        }
        return binarySearch(arr , target , start , end);
    }

    // binary search  second method
    static int binarySearch2(int[] array , int target , int start , int end){
        if(start > end){
            // ans not found
            return -1 ;
        }
        int mid = start + (end - start)/2 ;
        if(array[mid]  == target){
            // ans found
            return mid ;
        }
        if(array[mid] < target){
            return binarySearch2(array , target , mid +  1, end );
        }

        return binarySearch2(array , target , start , mid - 1 );


    }
}
