package LinearSearch;

public class FindMinimumNumber {
    public static void main(String[] args) {
        int[] array = {18,12,-7,3,14,28};
        System.out.println(minimumNumber(array));
    }
    //assume arr.length !=0
    static int minimumNumber(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length ; i++) {
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;

    }

}
