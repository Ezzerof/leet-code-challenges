package Easy;

import java.util.ArrayList;

import java.util.Collections;

public class MergeTwoSortedLists {

    public static void main(String[] args) {

        int[] list1 = {1,2,4};
        int[] list2 = {1,3,4};
        ArrayList<Integer> list3 = new ArrayList<>();

        int lengthList = list1.length + list2.length;

        for (int i = 0; i < list1.length; i++) {
            list3.add(list1[i]);
            list3.add(list2[i]);
        }

        Collections.sort(list3);
        System.out.println(list3);


    }


}
