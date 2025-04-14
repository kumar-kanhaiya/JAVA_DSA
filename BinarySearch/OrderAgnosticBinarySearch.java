package BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] array = {1,3,5,8,9,12,14,17,16,18};
        System.out.println(orderAgnosticBS(array,8));

    }
    static int orderAgnosticBS(int[] array , int target ){
        int start = 0;
        int end = array.length - 1;
        boolean isAsc = array[start] > array[end];
        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid == target){
                return mid;
            }
            if(isAsc){
            if(target < array[mid]){
                end = mid -1 ;
            }
            else {
                start = mid +1 ;
            }

            }
            else{
                if(target > array[mid]){
                    end = mid -1 ;
                }
                else{
                    start = mid +1 ;
                }

            }
        }
        return -1 ;
    }
}
