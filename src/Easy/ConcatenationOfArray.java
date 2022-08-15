package Easy;

public class ConcatenationOfArray {

    public static int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n * 2];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] a = {1,2,1};
        a = getConcatenation(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
