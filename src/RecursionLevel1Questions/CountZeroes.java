package RecursionLevel1Questions;

public class CountZeroes {
    public static void main(String[] args) {
        counting(10056);
        System.out.println(count);
        System.out.println(count(10056));
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

    // second Way
    // this program is done without using any global variable
    static int count(int number){
        return halper(number , 0);
    }

    private static int halper(int number, int i) {
        if(number < 1){
            return i;
        }
        if(number%10 == 0){
            halper(number/10 , i++);
        }
        return halper(number/10 , i);
    }
}
