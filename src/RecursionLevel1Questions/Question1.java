package RecursionLevel1Questions;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
    // printing n to 1 number using recursion
        //  simple recursive call
        // it is done by stack memory
        Scanner input = new Scanner(System.in);
        int number ;
        System.out.print("Enter your number : " );
        number = input.nextInt();
        System.out.println(print(number));
    }
    public static int print(int number ){
        // Base Case :
        if(number == 1){
            return 1;
        }
        System.out.print(number + " ");
        return print(number - 1);
    }

}
