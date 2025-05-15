package BinarySearch;

public class floor {
    public static void main(String[] args) {
        int[] array = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(Floor(array,target));
    }
    // return the index : greatest number less than or equal to target
    static int Floor(int[] array , int target){
        int start = 0;
        int end = array.length - 1 ;
        while(start<= end){
            int mid = start + (end - start)/2;
            if(array[mid]> target){
                end = mid -1 ;
            }
            else if(array[mid] < target){
                start = mid +1 ;
            }
            else{
                // answer found
                return mid;
            }
        }
        return end;
    }
}
