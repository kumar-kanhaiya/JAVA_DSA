package StringBuffer;

import com.sun.security.jgss.GSSUtil;

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

}
