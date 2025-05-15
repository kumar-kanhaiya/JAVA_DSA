package LinearSearch;

public class linearSearch {
    public static void main(String[] args) {
        int[] nums = { 23,45,65,25,78,95,21,23,25};
        System.out.println(linearSearch(nums,25));

    }
    // sear h the target and return the element
    static int linearSearch2(int[] array , int target){
        if(array.length == 0){
            return -1;
        }
        // run a for loop
        for (int element : array){
            //check for the element at every index if it is = target
            if(element == target){
                return element;
            }
        }
        // return value
        // this line is execute if none of the return statement hits
        return -1;
    }
    // search the target and return true and false
    static boolean linearSearch3(int[] array , int target){
        if(array.length == 0){
            return false;
        }
        // run a for loop
        for (int i = 0 ; i< array.length ; i++){
            //check for the element at every index if it is = target
            int element = array[i];
            if(element == target){
                return true;
            }
        }
        // return value
        // this line is execulte if none of the return statement hits
        return false;
    }
    //search in the array: return the index if item found
    //otherwise if item not found return -1
    static int linearSearch(int[] array , int target){
        if(array.length == 0){
            return -1;
        }
        // run a for loop
        for (int i = 0 ; i< array.length ; i++){
            //check for the element at every index if it is = target
            int element = array[i];
            if(element == target){
                return i;
            }
        }
        // return value
        // this line is execulte if none of the return statement hits
        return -1;
    }
}
