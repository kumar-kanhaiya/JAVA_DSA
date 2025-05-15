package BinarySearchIn2DArray;

public class SearchInASortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target = 2;

    }
    // search in the row provided between the columns provided
    static int[] binarySearch(int[][] matrix , int row ,  int cStart , int cEnd , int target ){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart)/2;
            if(matrix[row][mid] == target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid] < target){
                cStart = mid +1 ;
            }
            else{
                cEnd = mid -1 ;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] matrix , int target ){
        int row = matrix.length;
        int columns = matrix[0].length; // be cautions, matrix may be empty
        if(row == 1){
            return binarySearch(matrix,0,0,columns-1,target);
        }
        int rStart = 0;
        int rEnd = row -1 ;
        int cMid = columns/2;
        // run the loop till two rows are remaining
        while(rStart < (rEnd-1)){
            int mid = rStart + (rEnd-rStart)/2;
            if(matrix[mid][cMid] == target){
                return new int[]{mid,cMid};
            }
            if(matrix[mid][cMid] < target){
                rStart = mid;
            }else {
                rEnd = mid;
            }
            // now we have two rows
            // check whether the target is in tht col of 2 row
            if(matrix[rStart][cMid] == target){
                return new int[] {rStart,cMid};
            }
            if(matrix[rStart + 1][cMid] == target){
                return new int[]{rStart+1 , cMid};
            }
        }
        return new int[]{-1,-1};
    }
}
