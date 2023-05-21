package Easy.arrays;

import java.util.Arrays;

public class ConcatenationOfArray {

//    public static int[] getConcatenation(int[] nums) {
//
//        int n = nums.length;
//        int[] ans = new int[n * 2];
//
//        for (int i = 0; i < n; i++) {
//            ans[i] = nums[i];
//            ans[i + n] = nums[i];
//        }
//
//        return ans;
//    }

    public static int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n * 2];

        for (int i = 0; i < ans.length; i++) {
            if (i >= n)
                ans[i] = nums[i - n];
            else
                ans[i] = nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(getConcatenation(new int[]{1,2,2,1})));

    }
}
