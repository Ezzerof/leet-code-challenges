import java.util.Arrays;

public class Test {

    public static int[] concatenationOfArrays(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums[i]];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(concatenationOfArrays(new int[] {0,2,1,5,3,4})));
    }

}
