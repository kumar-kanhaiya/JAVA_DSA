public class check {
    public static void main(String[] args) {
        int n = 40 ;
        isPrime(n);

    }
    public static void isPrime( int n){
        boolean[] arr = new boolean[n+1];
        for (int i = 2; i*i < n ; i++) {
            if(!arr[i]){
                for (int j = i*i; j <=n ; j += i) {
                    arr[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if(!arr[i]){
                System.out.print( i + " ");
            }
        }
    }
}
