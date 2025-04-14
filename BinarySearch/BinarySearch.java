package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1,3,5,8,9,12,14,17,16,18};
        System.out.println(binarySearch(array,8));

    }
    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[] arr, int target ){
    int start = 0;
    int end = arr.length - 1;
    while(start <= end){
        int mid = start + (end - start)/2;
        if(target < arr[mid]){
            end = mid -1 ;
        }
        else if (target> arr[mid]){
            start = mid +1 ;
        }
        else{
            // answer found
            return mid;
        }
    }
    return -1 ;
    }
}
