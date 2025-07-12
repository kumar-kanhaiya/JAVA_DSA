package RecursionArrayQuestion;

public class sortedArray {
    public static void main(String[] args) {
    // find if array is sorted or not
        // arr = {1,2,4,8,9,12}
        int[] arr = { 1,2,4,8,9,12};
        int[] check = {1,2,0,5,3,8,4};

        System.out.println(isSorted(arr));
        System.out.println(isSorted2(check , 0));
    }
    public static boolean isSorted(int[] array ){
        return helper(array , 0);
    }
    static boolean helper(int[] array , int start ){
        if(start == array.length - 1){
            return true;
        }
        if(array[start] > array[start + 1]){
            return false;
        }
        return helper(array , start + 1);
    }
    // second approach
    public static boolean isSorted2(int[] array , int index){
        if(index == array.length - 1 ){
            return true;
        }
        return array[index] < array[index +1 ] && isSorted2(array , index + 1);
    }
}
