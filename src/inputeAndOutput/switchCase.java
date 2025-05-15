package inputeAndOutput;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String fruits = input.next();
//        if(fruits.equals("mango")){
//            System.out.println("Hey !! mango is sweet ");
//        }
//        else if(fruits.equals("orange")){
//            System.out.println("Good Oranges");
//        }
//        else if(fruits.equals("banana")){
//            System.out.println("banana ");
//        }
//        else{
//            System.out.println("Invalid choice ");
//        }
    int day = input.nextInt();
    switch (day){
        case 1 -> System.out.println("sunday");
        case 2 -> System.out.println("monday");
        case 3 -> System.out.println("tuesday");
        case 4 -> System.out.println("Wednesday");
        case 5 -> System.out.println("thursday");
        case 6 -> System.out.println("friday");
        case 7 -> System.out.println("saturday");
    }

    }
}
