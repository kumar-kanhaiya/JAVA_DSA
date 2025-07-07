package BasicMath;

public class NumberOfDigits {
    public static void main(String[] args) {
         // normal approach
        int n = 6;
        int count = 0 ;
        while(n>0 ){
            int last = n & 1;
            n = n >> 1;
            count++;
        }
        System.out.println(count);

        // Second and best formula approach
        int number = 6;
        int base = 2 ;
        int ans = (int) (Math.log(number) / Math.log(base)) + 1;
        System.out.println(ans);
    }

}
