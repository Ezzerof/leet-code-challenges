package Easy.arrays;

public class SmallerNumbers {

    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] result = new int[nums.length];
        int count = 0;

        for (int j = 0; j < nums.length; j++) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[j] > nums[i]) {
                    count++;
                }
            }
            result[j] = count;
            count = 0;
        }

        return result;
    }

    public static void main(String[] args) {
        
    }

}
