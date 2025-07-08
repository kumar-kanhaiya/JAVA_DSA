package BasicsMath;

import java.util.Scanner;

public class PrintAllPrimeNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number ");
        int number = input.nextInt();
        System.out.println("All prime number between 0 & " + number);
        for (int i = 0; i < number ; i++) {
            boolean check = isPrime(i);
            if(check == false){
                continue;
            }
            System.out.println(i);
        }

    }
    public static boolean isPrime(int number ){
        if(number <= 1){
            return false;
        }
        int c = 2;
        while(c*c <= number){
            if(number%c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
