package Easy;

import java.util.ArrayList;
import java.util.Collections;

public class PalindromeNumber {

    public static boolean isPalindrome(int x){

        String a = Integer.toString(x);
        StringBuilder b = new StringBuilder(a);
        b.reverse();
        int count = 0;
        boolean c = false;

        for (int i =0; i< b.length(); i++){
            if (a.charAt(i) == b.charAt(i)){
                count++;
            } else
                return false;
        }
        if (count == a.length())
            c=true;

        return c;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(1441));


    }
}
