package Easy.arrays;

public class ShuffleArray {
    public static int[] shuffle(int[] nums, int n) {
        int[] nums2 = new int[n*2];
        int j = 0;

        for (int i = 0; i < nums.length -1; i+=2) {
            nums2[i] = nums[j];
            nums2[i + 1] = nums[n + j];
            j++;
        }

        return nums2;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};

        for (int i: shuffle(nums, 3)) {
            System.out.println(i);
        }

    }
}
