package LinearSearch;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][]  account = {
                {1,5},
                {7,3},
                {3,5}
        };
        System.out.println(maximumWealth(account));
    }
    static int maximumWealth(int[][] array){
        int max = 0 ;
        for (int row = 0; row < array.length; row++) {
            int count = 0;
            for (int columns = 0; columns < array[row].length; columns++) {
                count += array[row][columns];
                if(count > max){
                    max = count ;
                }
            }
        }
        return max;
    }
}
