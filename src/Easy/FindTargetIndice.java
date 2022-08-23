package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindTargetIndice {

    public static List<Integer> targetIndices(int[] nums, int target) {

        //Method 1

//        int len = nums.length;
//
//        for (int i = 0; i < len - 1; ++i) {
//            for (int j = 0; j < len - i - 1; ++j) {
//                if (nums[j+1] < nums[j]) {
//                    int temp = nums[j];
//                    nums[j] = nums[j+1];
//                    nums[j+1] = temp;
//                }
//            }
//        }
//
//        List<Integer> list = new ArrayList<>();
//
//        for (int i = 0; i < len; i++) {
//            if (nums[i] == target) {
//                list.add(i);
//            }
//        }

        //return list;

        //Method 2

//        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
//        Collections.sort(list);
//        List<Integer> list2 = new ArrayList<>();
//        list2.add(list.indexOf(target));
//
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) == target) {
//                list2.add(i);
//            }
//        }
//
//        return list2;

        //Method 3

        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                list.add(i);
        }
        return list;

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 2, 3};
        int target = 2;

        System.out.println(targetIndices(nums, target));
    }
}
