package BinarySearchLeetCode_Problems;

public class problem852 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,9,3,2,1};
        System.out.println(largestNumberIndex(array));

    }
    static int largestNumberIndex(int[] array ){
        int start = 0 ;
        int end = array.length-1 ;
        while(start< end){
            int mid = start + (end - start)/2;
            if(array[mid] > array[mid +1 ]){
                end = mid ;
            }
            else {
                start = mid + 1 ;
            }

        }
        return start;
    }
}
