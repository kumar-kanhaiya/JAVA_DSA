package Bitwise;

public class numberOfSetBit {
    public static void main(String[] args) {
    // normal approach
        int number = 6 ;
        int count = 0 ;
        while(number > 0){
            if((number & 1) == 1){
                count++;
            }
            number = number>>1;
        }
        System.out.println(count);

        // second approach
        System.out.println(setBits(197));
    }

    public static int setBits(int n) {
        int count = 0;
        while(n > 0){
            count++;
            n = n & (n-1);
        }

        return count;
    }

}
