package BinarySearchLeetCode_Problems;

public class leetcode852 {
    public static void main(String[] args) {
        int[] array = {0, 1, 0};
        System.out.println(maxPoint(array));
    }

//    static int maxNumber(int[] array) {
//        int max = array[0];
//        for (int element : array) {
//            if (element > max) {
//                max = element;
//            }
//        }
//        return max;
//    }

    static int maxPoint(int[] array) {
        int start = 0;
        int end = array.length - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {

            if (array[mid] > array[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }


        }
        return start;
    }
}

