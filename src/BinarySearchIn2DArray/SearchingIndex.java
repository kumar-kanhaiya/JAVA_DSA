package BinarySearchIn2DArray;

public class SearchingIndex {
    public static void main(String[] args) {
        int[][] array = {
                {18,9,12},
                {36,-4,91},
                {44,33,16}
        };
        ArrayIndex(array,91);

    }
    public static void ArrayIndex(int[][] array , int target ){
        boolean check = false;
        int row = 0 , collums = 0;
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                if(array[i][j] == target){
                    check = true;
                    row = i ;
                    collums = j;
                }
            }

        }
        if(check){
            System.out.print("Element found in index " + row + " , " + collums);
        }
        else{
            System.out.println("Element not found in array ");
        }

    }
}
