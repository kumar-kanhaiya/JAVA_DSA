package LinearSearch;

public class FindNumbersWithEvenNumberOfDigit {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(EvenNumberOfDigit(nums));
    }
    static int EvenNumberOfDigit(int[] array ){
        if(array.length == 0){
            return -1;
        }
        int finalCount = 0;
        for (int element : array) {
            int number = element ;
            int count = 0 ;
            while(number>0){
                int rem = number%10;
                number /=10;
                count++;
            }
            if(count%2 == 0){
                finalCount ++ ;
            }
        }
        return finalCount;
    }

}
