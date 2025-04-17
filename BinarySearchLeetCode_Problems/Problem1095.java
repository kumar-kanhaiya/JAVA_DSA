package BinarySearchLeetCode_Problems;

public class Problem1095 {
    public static void main(String[] args) {
        int[] Arr = {1,2,3,4,5,3,1};
        int target = 2 ;
        System.out.println(findInMountainArray(target, Arr));
    }
    public static int findInMountainArray(int target, int[] mountainArr) {
        int peak = MountainArray(mountainArr);
        int firstTry = binarySearch(mountainArr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        // try to search in second half
        return binarySearch(mountainArr, target, peak+1, mountainArr.length - 1);
    }




    public static int MountainArray(int[] mountainArr){
        int start = 0;
        int end = mountainArr.length-1;
        while(start<end){
            int mid = start + (end - start)/2;
            if(mountainArr[mid] > mountainArr[mid+1]){
                end = mid;
            }
            else{
                start = mid +1;
            }
        }
        return start;
    }
    public static int binarySearch(int[] array , int target , int start , int end ){
        boolean isAsc = array[start] < array[end];
        while(start <= end){
            int mid = start + (end - start)/2;
            if(array[mid] ==  target){
                return mid ;
            }
            if(isAsc){
                if(target < array[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid +1 ;
                }
            }
            else{
                if(target>array[mid]){
                    end = mid -1 ;
                }
                else{
                    start = mid +1 ;
                }
            }
        }
        return -1;
    }

    }

