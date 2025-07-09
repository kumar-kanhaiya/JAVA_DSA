package RecursionLevel1Questions;

public class OneToN {
    public static void main(String[] args) {
        System.out.println(Printing(12, 1));
        printRev(12);

    }
    // this function is used to print number from 1 to N
    public static int Printing(int number , int n ){
        if(n == number){
            return number;
        }
        System.out.print(n + " ");

        return Printing(number  , n+1 );
    }
    // second Approach
    public static void printRev(int number ){
        if(number == 0){
            return;
        }
        printRev(number - 1);
        System.out.print(number + " ");
    }
}
