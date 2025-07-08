package Bitwise;

import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number ;
        System.out.print("Enter number : ");
        number = input.nextInt();
        System.out.println(ans(number));
    }
    public static int ans(int number ){
        int target = 1 ;
        while(true){
            if((number << (target) & 1) == 1 ){
                return target;
            }
            else{
                target ++ ;
            }
        }
    }
}
