package Easy.arrays;

import java.util.Iterator;
import java.util.LinkedHashSet;


public class IntersectionPfTwoArrays {

    public static int[] intersection(int[] nums1, int[] nums2) {
        LinkedHashSet<Integer> first = new LinkedHashSet<>();
        LinkedHashSet<Integer> second = new LinkedHashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            first.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            second.add(nums2[i]);
        }
        LinkedHashSet<Integer> intersection = new LinkedHashSet<>(first);
        intersection.retainAll(second);

        int[] temp = new int[intersection.size()];
        Iterator<Integer> values = intersection.iterator();

        int i = 0;
        while (values.hasNext()) {
            temp[i] = values.next();
            ++i;
        }

        return temp;
    }

    public static void main(String[] args) {
        int[] n1 = {4,9,5};
        int[] n2 = {9,4,9,8,4};
        intersection(n1, n2);
    }

}
