package Easy.arrays;

import java.util.Arrays;

public class MaximumProductOfTwo {

    public int maxProduct(int[] nums) {
        int len = nums.length - 1;

        Arrays.sort(nums);

        return (nums[len] - 1) * (nums[len - 1] - 1);
    }

}
