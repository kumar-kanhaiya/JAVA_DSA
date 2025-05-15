package BinarySearch;

public class Ceiling {
    public static void main(String[] args) {
        int[] array = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(ceiling(array,target));

    }
    // return the index of smallest number >= target
    static int ceiling(int[] arr , int target ){
        // but if the target is greater than the greatest number in the array

        if(target> arr[arr.length-1]){
            return -1;
        }
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
        return start ;
    }
    }


