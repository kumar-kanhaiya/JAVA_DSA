package BasicMath;

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
    }
}
