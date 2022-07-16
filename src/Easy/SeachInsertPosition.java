package Easy;

import java.util.ArrayList;

public class SeachInsertPosition {

    static int searchInsert(int[] nums, int target){

        int count = 0;
        int listLength = nums.length - 1;
        int halfList = (listLength + count) / 2;

        while (count <= listLength){
            halfList = (listLength + count) / 2;

            if (nums[halfList] == target) {
                return halfList;
            }else if (nums[halfList] < target){
                count = halfList + 1;
            }else {
                listLength = halfList +1;
            }
        }

        return count;

    }

    public static void main(String[] args) {

        int[] a = {1,3,5,6};

        System.out.println(searchInsert(a,5));
    }
}
