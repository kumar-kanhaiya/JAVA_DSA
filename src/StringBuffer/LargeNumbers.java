package StringBuffer;

import com.sun.security.jgss.GSSUtil;

import java.math.BigDecimal;
import java.math.BigInteger;

public class LargeNumbers {
    public static void main(String[] args) {
        int a = 30;
        int b = 67;


        BigInteger A = BigInteger.valueOf(33);
        BigInteger B = BigInteger.valueOf(3384);
        BigInteger C = new BigInteger("468454");
        BigInteger F = new BigInteger("46845454658468");

        // constant
        BigInteger D = BigInteger.ONE;

        // Addition
        BigInteger s = A.add(B);
        System.out.println(s);

        // multiplication
        BigInteger m = C.multiply(F);
        System.out.println(m);

    }
    static BigInteger fact(int num){
        BigInteger ans = new BigInteger("`1");

        for (int i = 2; i <= num ; i++) {
            ans = ans.multiply(BigInteger.valueOf(i));
        }
        return ans;
    }
    static void BD() {
        double x = 0.03;
        double y= 0.04;
        // double ans = y-x;
        // System.out.println(ans);

        BigDecimal X = new BigDecimal("0.03");
        BigDecimal Y = new BigDecimal("0.04");
        BigDecimal ans = Y.subtract(X);
        // System.out.println(ans);

        BigDecimal a = new BigDecimal("456576345675.4546376");
        BigDecimal b = new BigDecimal("547634565352.986785764");

        // operations
        System.out.println(b.add(a));
        System.out.println(b.subtract(a));
        System.out.println(b.multiply(a));
        System.out.println(b.pow(2));
        System.out.println(b.negate());

        // constants
        BigDecimal con = BigDecimal.ONE;

    }


    static void BI() {
        int a = 30;
        int b = 67;

//        BigInteger B = BigInteger.valueOf(6); // convert int/long to BI
//        int c = B.intValue(); // convert BI to int
//        BigInteger C = new BigInteger("2345678654325678976543256789");
//        BigInteger X = new BigInteger("4536789765432");
//
//        // constants
//        BigInteger D = BigInteger.TEN;
//
//        // operations
//        BigInteger s = C.add(X);
//
//        BigInteger m = C.multiply(X);
//
//        BigInteger sub = C.subtract(X);
//
//        BigInteger d = C.divide(X);
//
//        BigInteger rem = C.remainder(X);
//
//        if (X.compareTo(C) < 0) {
//            System.out.println("Yes");
//        }
//
//
//    }
//
//}
