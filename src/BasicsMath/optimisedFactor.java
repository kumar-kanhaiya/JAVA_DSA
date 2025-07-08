package BasicsMath;

public class optimisedFactor {
    public static void main(String[] args) {
        factor(20);
    }
    public static void factor(int number ){
        for (int i = 1; i <= Math.sqrt(number) ; i++) {
            if(number%i == 0 ){
                if(number/i == i){
                    System.out.print(i);
                }
                else{

                System.out.print( i + " " + (number/i) + " ");
                }
            }
        }
    }
}
