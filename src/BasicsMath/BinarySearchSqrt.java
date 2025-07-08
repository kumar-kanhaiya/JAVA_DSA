package BasicsMath;

public class BinarySearchSqrt {
    public static void main(String[] args) {
        int n = 40 ;
        int p = 3;

        System.out.println(sqrt(n , p ));
    }
    static double sqrt(int n , int p ){
        int start = 0 ;
        int end = n;

        double root = 0.0;
        while(start <= end ){
            int mid = start + (end - start )/2;
            if(mid*mid == n){
                // ans found
                return mid;
            }
            else if(mid*mid > n){
                end =  mid -1 ;

            }
            else{
                start = mid +1;
            }
        }

        return root;
    }
}
