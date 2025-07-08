package BasicsMath;

import java.util.Scanner;

public class PrintAllPrimeNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

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
