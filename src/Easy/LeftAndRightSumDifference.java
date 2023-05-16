package Easy;

public class LeftAndRightSumDifference {

    public static int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int left = 0;
        int right = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                left += 0;
                leftSum[i] = left;
            } else {
                left += nums[i - 1];
                leftSum[i] = left;
            }
            right += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            right -= nums[i];
            rightSum[i] = right;
        }

        for (int i = 0; i < nums.length; i++) {
            int temp = rightSum[i] - leftSum[i];
            if (temp < 0) {
                nums[i] = temp * -1;
            } else {
                nums[i] = rightSum[i] - leftSum[i];
            }
        }
        return nums;
    }

}
