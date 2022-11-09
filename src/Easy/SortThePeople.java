package Easy;

import java.util.HashMap;

public class SortThePeople {

    public String[] sortPeople(String[] names, int[] heights) {

        HashMap<Integer, String> list = new HashMap<>();

        for (int i = 0; i < names.length; i++) {
            list.put(heights[i], names[i]);
        }

        //Bubble sort
        for (int i = 0; i < heights.length-1; i++) {
            for (int j = 0; j < heights.length - i - 1; ++j){

                if (heights[j + 1] > heights[j]) {
                    int temp = heights[j];
                    heights[j] = heights[j+1];
                    heights[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < heights.length; i++) {
            names[i] = list.get(heights[i]);
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
