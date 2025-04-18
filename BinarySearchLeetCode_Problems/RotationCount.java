package BinarySearchLeetCode_Problems;

public class RotationCount {
    public static void main(String[] args) {
        int[] array = {7, 9, 11, 12, 5};
//        System.out.println(minimumIndex(array));
        System.out.println(ans(array));

    }
    public static int ans(int[] array ){
        int pivot = binarySearch(array);
        if(pivot == -1){
            return 0;
        }
        return pivot+ 1;
    }
    public static int minimumIndex(int[] array){
        int min = array[0];
        int index = 0;
        for(int i = 1 ; i< array.length ; i++){
            if(min > array[i]){
                min = array[i];
                index = i ;
            }
        }
        return index;
    }
    // solution by using binary search
    public static int binarySearch(int[] array){
        // let us finding pivot
        int start = 0;
        int end = array.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(array[mid] > array[mid+1]){
                return mid ;
            }
            if(array[mid] < array[mid-1]){
                return mid-1;
            }
            if(array[start] >= array[mid]){
                end = mid -1 ;
            }
            else{
                start = mid+1;
            }
        }
        return  -1;
    }

}


