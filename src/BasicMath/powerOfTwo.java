package BasicMath;

public class powerOfTwo {
    public static void main(String[] args) {
        int n = 4 ;
        boolean ans = (n & (n-1)) == 0 ;
        System.out.println(ans);
    }
}
