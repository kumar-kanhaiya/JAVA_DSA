package BinarySearchLeetCode_Problems;

import java.util.Arrays;

public class problem34 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};

        int[] ans = searchRange(nums,7);
        System.out.println(Arrays.toString(ans));

    }
    //  find first or last position of Element in sorted array
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int start = firstIndex(nums,target,true);
        int end = firstIndex(nums,target,false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    public static int firstIndex(int[] nums, int target , boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length -1 ;
        while(start<= end){
            int mid = start + (end - start)/2;
            if(target> nums[mid]){
                start = mid +1 ;

            }
            else if(target < nums[mid]){
                end = mid -1 ;
            }
            else{
                // potential answer found
                ans = mid ;
                if(findStartIndex){
                    end = mid -1 ;
                }
                else{
                    start = mid +1 ;
                }
            }
        }
        return ans;
    }
}
