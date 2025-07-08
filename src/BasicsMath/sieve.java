package BasicsMath;

public class sieve {
    public static void main(String[] args) {
        int n = 40;
        boolean[] prime = new boolean[n+1];
        seives(n , prime);
    }
    // initially all value is false
    public static void seives(int n , boolean[] prime){
        for (int i = 2; i*i <= n ; i++) {
            if(!prime[i]){
                for (int j = i*2; j <= n ; j+=i) {
                    prime[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if(!prime[i]){
                System.out.print(i + " ");
            }
        }
    }
}
