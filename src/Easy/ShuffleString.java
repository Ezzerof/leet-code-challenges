package Easy;

import java.util.ArrayList;

public class ShuffleString {

    public String restoreString(String s, int[] indices) {
        ArrayList<Integer> list = new ArrayList<>();
        String sortedWord = "";

        for (int i = 0; i < s.length(); i++) {
            list.add(indices[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            sortedWord += s.charAt(list.indexOf(i));
        }

        return sortedWord;
    }

    public static void main(String[] args) {
        ShuffleString s = new ShuffleString();
        System.out.println(s.restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3}));
    }

}
