package Easy.arrays;

public class FindPivotIndex {

    static int pivotIndex(int[] nums){

        int sum = 0;

        for (int i = 0; i < nums.length; i++){
            sum +=nums[i];
        }

        int leftSum = 0;
        int rightSum = sum;

        for (int i = 0; i < nums.length; i++) {
            rightSum = rightSum - nums[i];

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] a = {1,7,3,6,5,6};

        System.out.println(pivotIndex(a));
    }

}
