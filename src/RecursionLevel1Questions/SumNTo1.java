package RecursionLevel1Questions;

public class SumNTo1 {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
    public static int sum(int number ){
        if(number == 1 ){
            return 1;
        }
        return number + sum(number - 1);
    }
}
