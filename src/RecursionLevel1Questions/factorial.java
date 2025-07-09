package RecursionLevel1Questions;

public class factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    public static int fact(int number ){
        if(number == 1){
            return 1 ;
        }
        return number * fact(number - 1 );
    }
}
