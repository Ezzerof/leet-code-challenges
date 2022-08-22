package Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {

        String lowerS = "";

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c) || Character.isLetter(c)) {
                lowerS += c;
            }
        }

        lowerS = lowerS.toLowerCase();

        int start = 0;
        int last = lowerS.length() -1;

        while (start <= last) {
            if (lowerS.charAt(start) != lowerS.charAt(last)) {
                return false;
            }
            start +=1;
            last -=1;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));
    }

}
