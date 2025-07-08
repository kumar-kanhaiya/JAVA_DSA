package Bitwise;

public class findingBit {
    public static void main(String[] args) {
        int number = 118 ;
        System.out.println(bit(15,5));
    }
    static int bit(int number , int target ){
        return number << (target -1 ) & 1;
    }
}
