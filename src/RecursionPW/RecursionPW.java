package RecursionPW;

//  A function calling itself with different
//  parameters & a base case to terminate the infinte loop .
//  In recursion , we sole a bigger problem by
//  solving smaller subproblem
public class RecursionPW {
    public static void main(String[] args) {
        // recursive function :- A function calling itself.

//        printIncreasing(5);
        System.out.println("Factorial : " + factorial(5));
        naturalNumberReverse(5);
    }
    public static void printIncreasing(int n ){
        if(n == 1){
            System.out.print(1);
            return ;
        }
        printIncreasing(n-1); // 1 , 2 , ... n-1
        System.out.print(n);

    }
    public static int factorial(int number ){
        if(number == 1 ){
            return 1 ;
        }
        return number* factorial(number - 1);
    }
    public static void naturalNumber(int number ){
        if(number == 0){
            return;
        }
        naturalNumber(number - 1);
        System.out.println(number);
    }
    public static void naturalNumberReverse(int number){
        if(number == 0){
            return;
        }
        System.out.println(number);
        naturalNumberReverse(number - 1 );
    }
}
