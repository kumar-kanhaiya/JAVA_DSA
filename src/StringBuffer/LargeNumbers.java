package StringBuffer;

import java.math.BigInteger;

public class LargeNumbers {
    public static void main(String[] args) {
        int a = 30;
        int b = 67;

        BigInteger A = BigInteger.valueOf(33);
        BigInteger B = BigInteger.valueOf(3384);
        BigInteger C = new BigInteger("468454");

        // constant
        BigInteger D = BigInteger.ONE;

        // Addition
        BigInteger s = A.add(B);
        System.out.println(s);

    }
}
