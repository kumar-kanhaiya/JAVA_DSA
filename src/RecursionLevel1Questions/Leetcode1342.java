package RecursionLevel1Questions;

public class Leetcode1342 {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
    public static int numberOfSteps(int num) {
        return helper(num , 0);
    }

    public static int helper(int num, int i) {
        if(num < 1){
            return i;
        }
        if(num%2 == 0){
            return helper(num/2 , i = i +1 );
        }
        return helper(num - 1 , i= i +1);
    }
}
