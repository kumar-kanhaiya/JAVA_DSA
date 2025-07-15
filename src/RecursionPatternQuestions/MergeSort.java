package RecursionPatternQuestions;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
    int[] array = {5,4,3,2,1};
    array = mergeSort(array);
//    sorting(array , (array.length)/2 , 0  );
//    sorting(array , (array.length -1 ), (array.length - 1)/2 + 1  );
//        System.out.println(Arrays.toString(array));
        int[] arr = {8,9,10,12};
        int[] prr = {1,2,3,4};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(merge(arr,prr)));
    }
    public static void sorting(int[] array , int row , int collom){
        if(row == 0){
            return;
        }
        if(row > collom){
            if(array[collom] > array[collom+1]){
                swap(array , collom ,collom + 1);
            }
            sorting(array,row,collom + 1);
        }
        else{
            sorting(array,row - 1 ,0);
        }
    }
    public static void swap(int[] array , int first , int second ){
        int temp = array[first];
        array[first] =array[second];
        array[second] = temp;
    }

    static int[] mergeSort(int[] array ){
        if(array.length == 1){
            return array;
        }

        int mid = array.length /2 ;
        int[] left = mergeSort(Arrays.copyOfRange(array,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(array,mid , array.length));

        return merge(left,right);

    }

    private static int[] merge(int[] first, int[] second) {
        int[] ans = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i< first.length && j< second.length) {
            if (first[i] < second[j]) {
                ans[k] = first[i];
                i++;
            }
            else{
                ans[k] = second[j];
                j++;

            }
            k++;
        }

        // it may be possible that one of the array is not complete
        while(i< first.length){
            ans[k] = first[i];
            i++;
            k++;
        }
        while(j< second.length){
            ans[k] = second[j];
            j++;
            k++;
        }
        return ans;
    }

    // in place algorithm
    public static void mergeSort2(int[] array , int start , int end ){
        if(end - start == 1){
            return;
        }
        int mid = start + (end - start)/2;
        mergeSort2(array , 0 , mid);
        mergeSort2(array , mid , array.length);

        mergeInPlace(array , start , mid , end );
    }
    static int[] mergeInPlace(int[] array , int start , int mid , int end ){
        int[] mix = new int[end - start];
        int i = start;
        int j = mid;
        int k = 0;
        while(i<mid && j < end ){
            if(array[i] < array[j]){
                array[k] = array[i];
                i++;
            }
            else{
                array[k] = array[j];
                j++;
            }
            k++;
        }
        while(i < mid){
            array[k] = array[i];
            i++;
            k++;
        }
        while( j < end ){
            array[k] =array[j];
            j++;
            k++;
        }

        return mix;

    }
}
