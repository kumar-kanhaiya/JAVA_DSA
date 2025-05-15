package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int [] array = {18,12,-7,3,14,28};
        System.out.println(searchInRange(array,3 , 1 ,4));

    }
    // method for finding 3 in the range of index [ 1 , 4 ]
    static int searchInRange(int[] array , int target,int starting , int ending){
        if(array.length == 0 ){
            return -1;
        }
        for (int i = starting; i <=ending ; i++) {
            if(array[i] == target){
                return i;

            }
        }
        return -1;
    }
}
