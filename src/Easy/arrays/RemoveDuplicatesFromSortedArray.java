package Easy.arrays;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int previous = 0;
        int current = 0;

        while (current < nums.length) {
            if (nums[previous] == nums[current]) {
                current += 1;
            } else {
                previous += 1;
                if (previous != current) {
                    nums[previous] = nums[current];
                }
            }
        }
        return previous + 1;
    }

}
