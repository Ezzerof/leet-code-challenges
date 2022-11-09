package Easy;

import java.util.Arrays;
import java.util.HashMap;

public class SortThePeople {

    public String[] sortPeople(String[] names, int[] heights) {

//        boolean isOn = true;
//        while (isOn) {
//            isOn = false;
//            for (int i = 0; i < heights.length - 1; ++i) {
//                if (heights[i + 1] > heights[i]) {
//                    isOn = true;
//                    int temp = heights[i];
//                    heights[i] = heights[i + 1];
//                    heights[i + 1] = temp;
//                    String tempName = names[i];
//                    names[i] = names[i + 1];
//                    names[i + 1] =  tempName;
//                }
//            }
//        }
//
//        return names;



        HashMap<Integer, String> list = new HashMap<>();

        for (int i = 0; i < names.length; i++) {
            list.put(heights[i], names[i]);
        }

        //Bubble sort
//        for (int i = 0; i < heights.length-1; i++) {
//            for (int j = 0; j < heights.length - i - 1; ++j){
//
//                if (heights[j + 1] > heights[j]) {
//                    int temp = heights[j];
//                    heights[j] = heights[j+1];
//                    heights[j+1] = temp;
//                }
//            }
//        }

        Arrays.sort(heights);

        for (int i = names.length - 1; i >= 0; i--) {
            names[names.length - 1 - i] = list.get(heights[i]);
        }

        return names;
    }

    public static void printList(String[] names) {
        for (String n : names) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        SortThePeople s = new SortThePeople();
        String[] names = new String[] {"Mary","John","Emma"};
        int[] heights = new int[] {180,165,170};
        printList(s.sortPeople(names, heights));
    }

}
