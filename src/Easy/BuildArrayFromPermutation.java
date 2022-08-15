package Easy;

public class BuildArrayFromPermutation {

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {0,2,1,5,3,4};
        a = buildArray(a);
        for (int i: a) {
            System.out.println(i);
        }
    }

}
