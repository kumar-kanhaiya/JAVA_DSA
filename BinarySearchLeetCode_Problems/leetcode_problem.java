package BinarySearchLeetCode_Problems;

import java.util.Arrays;

public class leetcode_problem {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        int[] ans = check(nums,6);
        System.out.println(Arrays.toString(ans));
    }
    static int[] check(int[] nums , int target){
        if(nums.length==0){
            return new int[]{-1,-1};
        }
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i+1; j < nums.length ; j++) {
            int sum = nums[i] ;
                sum += nums[j];
                if(sum == target){
                    return new int[]{i,j};
                }
            }

        }
        return new int[]{-1,-1};
    }
}
