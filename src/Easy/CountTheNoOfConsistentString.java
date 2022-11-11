package Easy;

import java.util.HashSet;
import java.util.Set;

public class CountTheNoOfConsistentString {

    public int countConsistentStrings(String allowed, String[] words) {

        Set<Character> list = new HashSet<>();

        for(char ch : allowed.toCharArray()){
            list.add(ch);
        }

        int result = 0;

        for(String word : words){

            int count = 0;
            for(int i = 0; i < word.length(); i++){

                if(!list.contains(word.charAt(i))){
                    count = 1;
                    break;
                }
            }


            if(count != 1)
                result++;
        }

        return result;
    }

}
