package StacksAndQueues.LeetcodeProblems;

import java.util.Arrays;
import java.util.Stack;

public class hackerRankGameOfTwoStack {

    static int twoStack(int x , int[] a , int[] b){
        return twoStack(x,a,b,0,0) - 1;
    }
    private static int twoStack(int x , int[] a , int[] b , int sum , int count){
        if(sum > x){
            return count;
        }
        // condition
        if(a.length == 0 || b.length == 0){
            return count;
        }

        int ans1 = twoStack(x, Arrays.copyOfRange(a,1,a.length) , b , sum+a[0] , count+ 1);
        int ans2 = twoStack(x, a,Arrays.copyOfRange(b,1,a.length) ,  sum+b[0] , count+1);

        return Math.max(ans1,ans2);
    }

}
