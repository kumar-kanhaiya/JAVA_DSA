package RecursionLevel1Questions;

public class CountZeroes {
    public static void main(String[] args) {
        counting(10056);
        System.out.println(count);
    }
    // using recursion
    static int count = 0;
    public static void counting(int number ){
        if(number< 1 ){
            return;
        }
        if(number%10 == 0){
            count++;
        }
        counting(number/10);
    }
}
