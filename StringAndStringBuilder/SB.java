package StringAndStringBuilder;

import java.util.Scanner;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("main things take time ");
        System.out.println(builder);

        // string is palindrome or not
//        String name = "kanak";
//        String demo = "";
//        System.out.println(name.length());
//        for (int i = name.length()-1 ; i>=0 ;  i--) {
//            char p = name.charAt(i);
//
//            demo += p;
//
//        }
//        System.out.println(demo);
//        System.out.println(demo == name);
//        System.out.println(demo.equals(name));
        // 2nd approch
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = input.next();
        name = name.toLowerCase();

        boolean check = true;
        for (int i = 0; i < name.length() - 1 ; i++) {
            if(name.charAt(i) != name.charAt(name.length() - i - 1)){
                check = false;
            }
        }
        if(check){
            System.out.print("Palindrome");
        }else{
            System.out.println("Not Palindrome ");
        }
    }
}
