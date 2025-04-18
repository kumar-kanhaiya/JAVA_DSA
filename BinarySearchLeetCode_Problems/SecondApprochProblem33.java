package BinarySearchLeetCode_Problems;

public class SecondApprochProblem33 {
    public static void main(String[] args) {
        int[] nums = {6,7,1,2,3,4,5};
        int target = 6;
        System.out.println(search(nums,target));


    }
    public static int search(int[] array , int target ){
        int pivot = pivotIndex(array);
        // if pivot not found , it means the array is not rotated
        if(pivot == -1){
            // just do normal binary search
            return binarySearch(array,target,0, array.length-1);
        }
        // if pivot is found then you have two accending array
        if(array[pivot] == target){
            return pivot;
        }
        if(target >= array[0]){
            return binarySearch(array,target,0,pivot - 1);
        }

            return binarySearch(array,target,pivot+1,array.length - 1 );


    }

    public static int pivotIndex(int[] array ){
        int start = 0;
        int end = array.length-1;
        while(start<= end){
            int mid = start + (end - start)/2;
            // 4 cases
            if(mid < end && array[mid] > array[mid+1]){
                return mid;
            }
            if(start < mid && array[mid] < array[mid-1]){
                return mid-1;
            }
            // case 3
            if(array[mid] <= array[start]){
                end = mid -1;
            }
            else{
                start = mid +1;
            }
        }
        return -1 ;
    }
    public static int binarySearch(int[] array , int target , int start , int end ){
        while(start <= end ){
            int mid = start + (end - start)/2;
            if(array[mid] > target){
                end = mid -1 ;
            }
            else if(array[mid] < target){
                start = mid +1 ;
            }
            else{
                // ans found
                return mid ;
            }
        }
        return -1;
    }

}
