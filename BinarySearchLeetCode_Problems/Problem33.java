package BinarySearchLeetCode_Problems;

public class Problem33 {
    public static void main(String[] args) {
        int[] nums = {5,1,3};
        int target = 5;
        System.out.println(findingIndex(nums, target));
    }
    public static int findingIndex(int[] arr , int target ){
        int peak = maximumIndex(arr);
        int firstTry = binarySearch(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        return binarySearch(arr, target, peak +1 ,arr.length -1 );
    }
    public static int maximumIndex(int[] arr){
        int start = 0 ;
        int end = arr.length - 1;
        while(start< end ){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else{
                start = mid +1;
            }
        }
        return start;
    }
    public static int binarySearch(int[] arr , int target , int start , int end ){
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end - start )/2;
            if(target == arr[mid]){
                return mid ;
            }
            if(isAsc){
                if(arr[mid] > target){
                    end = mid -1;
                }
                else {
                    start = mid + 1;
                }

            }
            else{
                if(arr[mid] < target){
                    end = mid -1 ;
                }
                else{
                    start = mid +1;
                }
            }
        }
        return -1;
    }
}
