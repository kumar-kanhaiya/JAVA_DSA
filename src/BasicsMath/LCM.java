package BasicsMath;

public class LCM {
    public static void main(String[] args) {
        System.out.println(lcm(5,6));
    }
    public static int hcf (int a , int b ){
        if(a == 0){
            return b;
        }
        return hcf(b%a,a);
    }
    public static int lcm(int a , int b ){
        return (a*b)/hcf(a,b);
    }
}
