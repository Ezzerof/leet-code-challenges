package Easy.arrays;

public class RunningSumOf1DArray {
    public static int[] runningSum(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp += nums[i];
            nums[i] = temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        for(int i : runningSum(nums)) {
            System.out.println(i);
        }

    }
}
