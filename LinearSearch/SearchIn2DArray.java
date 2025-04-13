package LinearSearch;


import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {22 , 4 , 1},
                {18 , 12 , 3 , 9},
                {78,99,34 , 56 } ,
                {18,12,}
        };
        int target = 34 ;
        int[] answer = search(arr, target);
        System.out.println(Arrays.toString(answer));
    }
    static int[] search(int[][] array , int target){
        if(array.length == 0){

        }
        // loop for rows
        for (int row = 0; row < array.length; row++) {
            // loop for column
            for (int column = 0; column <  array[row].length; column++) {
                if(array[row][column] == target){
                    return new int[]{row,column};
                }
            }

        }
        return new int[]{-1,-1};
    }
}
