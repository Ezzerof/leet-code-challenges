package Easy.arrays;

public class RunningSumOfArray {

    static int[] runningSum(int[] nums){

        int[] output =  new int[nums.length];
        int temp = 0;

        for (int i = 0; i < nums.length; i++){
            temp += nums[i];
            output[i] = temp;
        }

        return output;
    }

}
