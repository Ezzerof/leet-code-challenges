package Easy;

// Given a string s consisting of words and spaces, return the length of the last word in the string.
//
//A word is a maximal substring consisting of non-space characters only.

import java.util.ArrayList;
import java.util.Arrays;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {

        String[] temp;
        temp = s.split(" ");
        ArrayList<String> arrS = new ArrayList<>(Arrays.asList(temp));
        String t = null;

        for (int i = arrS.size() - 1; i >= 0 ; i--) {

            System.out.println(arrS.get(i));

            if (!arrS.get(i).equals("")) {
                t = arrS.get(i);
                break;
            }
        }

        return t.length();

    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("  fly  me to   the moon   "));
    }

}
