package Easy;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    static boolean isIsomorphic(String s, String t){

        char[] sValues = new char[256];
        char[] tValues = new char[256];

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (sValues[sChar] == 0 && tValues[tChar] == 0){
                sValues[sChar] = tChar;
                tValues[tChar] = sChar;
            } else if (sValues[sChar] != tChar)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(isIsomorphic("egg", "add"));
    }
}
