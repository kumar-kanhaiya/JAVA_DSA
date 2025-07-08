package BasicsMath;

public class squareRoot {
    public static void main(String[] args) {
    int number = 49;
        System.out.println(squareroot(number));

    }
    public static int squareroot(int number){
        int start = 0 ;
        int end = number ;
        while(end >= start){
            int mid = start + (end - start)/2 ;
            if(mid*mid == number){
                // ans found
                return mid;
            }
            else if(mid*mid > number){
                end = mid - 1;
            }
            else{
                start = mid +1 ;
            }
        }
        return -1;
    }

}
