package BasicsMath;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter your number : ");
        number = input.nextInt();
        factor(number);

    }
    public static void factor(int number ){
        for (int i = 1; i <= number ; i++) {
            if(number%i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
