package RecursionLevel1Questions;

public class OneToN {
    public static void main(String[] args) {
        System.out.println(Printing(12, 1));

    }
    // this function is used to print number from 1 to N
    public static int Printing(int number , int n ){
        if(n == number){
            return number;
        }
        System.out.print(n + " ");

        return Printing(number  , n+1 );
    }
}
