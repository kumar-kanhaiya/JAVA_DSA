package LinkedList.Problems;

public class problem202 {
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = findingMultiplicationOfDigit(slow);
            fast = findingMultiplicationOfDigit(findingMultiplicationOfDigit(fast));
        }while(fast != slow);

        if(slow == 1){
            return true;
        }
        return false;

    }
    public static int findingMultiplicationOfDigit(int number ){
        int ans = 0;
        while(number > 0){
            int rem = number%10;
            ans += rem*rem;
            number /= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(12));
    }
}
