package BasicsMath;

public class HCF {
    public static void main(String[] args) {
        System.out.println(hcf(105,224));

    }
    public static int hcf(int first , int secong ){
        int min = min(first , secong);
        int ans = 1;
        for (int i = 1; i <= min ; i++) {
            if(first%i == 0 && secong%i == 0){
                ans = i;
            }
        }
        return ans;
    }
    public static int min(int first , int second ){
        if(first < second){
            return first;
        }
        return second;
    }
    // second approach by using recursion
    static int gcd(int a , int b ){
        if(a==0 ){
            return b;
        }
        return gcd(b%a , a);
    }
}
