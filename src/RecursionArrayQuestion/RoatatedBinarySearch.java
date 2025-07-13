package RecursionArrayQuestion;

import java.util.Arrays;

public class RoatatedBinarySearch {
    public static void main(String[] args) {
        int[] array = {5,6,7,8,9,1,2,3};
        System.out.println(search(array,2,0,array.length - 1));


    }
    static int search(int[] array , int target , int s , int e){
        if(s > e){
            // array is not sorted
            return -1;
        }
        int mid = s + (e-s)/2;
        if(array[mid] == target){
            // ans found
            return mid;
        }
       if( array[s] <= array[mid]){
           // it means first half is sorted
           if(target> array[s] && target < array[mid]){
               return search(array,target,s,mid -1);
           }
           else{
               return search(array,target,mid +1 ,e);
           }
       }
       if(target >= array[mid] && target <= array[e]){
           return search(array,target,mid +1 , e);
       }
       return search(array,target,s , mid-1);
    }

}
