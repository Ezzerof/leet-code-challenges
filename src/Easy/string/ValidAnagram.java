package Easy.string;

import java.util.ArrayList;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        ArrayList<String> a = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            a.add(String.valueOf(s.charAt(i)));
        }


        for (int i = 0; i < t.length(); i++) {
            a.remove(String.valueOf(t.charAt(i)));
        }


        if (a.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anana", "nnaaa"));
    }

}
