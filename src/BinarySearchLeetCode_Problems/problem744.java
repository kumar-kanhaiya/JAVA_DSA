package BinarySearchLeetCode_Problems;

public class problem744 {
    public static void main(String[] args) {
        char[] letter = {'c','f','j'};
        char target = 'c';
        char ans = nextGreatestLetter(letter,target);
        System.out.println(ans);
    }
    public static char nextGreatestLetter(char[] letters , char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
             if (target < letters[mid]) {
                end = mid - 1;
            }
             else{
                 start = mid+1;
             }

        }
        return (char) letters[start % letters.length];
    }
}
