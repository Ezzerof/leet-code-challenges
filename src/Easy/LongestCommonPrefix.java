package Easy;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs){

        int size = strs.length;

        if (size == 0){
            return "";
        } else if (size == 1){
            return strs[0];
        }

        Arrays.sort(strs);
        int minimumLength = Math.min(strs[0].length(), strs[size-1].length());

        int i =0;
        while (i<minimumLength && strs[0].charAt(i) == strs[size-1].charAt(i))
            i++;

        String prefix = strs[0].substring(0,i);
        return prefix;
    }


    public static void main(String[] args) {

        String[] s = {"flower", "flow", "flight"};

        System.out.println(longestCommonPrefix(s));


    }
}
