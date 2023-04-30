package Easy;

import java.util.*;

public class FindCommonCharacter {

    public List<String> commonChars(String[] words) {

        String[] word = words[0].split("");
        List<String> result = new ArrayList<>();

        for (int i = 0; i < word.length; i++) {
            if (checkLetter(word[i], words) == 1) {
                result.add(word[i]);
            }
        }

        printList(result);

        return result;
    }

    public int checkLetter(String letter, String[] words) {

        for (int i = 1; i < words.length; i++) {
            if (!words[i].contains(letter)) {
                return 0;
            } else {
                words[i] = words[i].replaceFirst(letter, "@");
            }
        }
        return 1;
    }

    public void printList(List<String> list) {
        for (String w : list) {
            System.out.println(w);
        }
    }

    public static void main(String[] args) {
        FindCommonCharacter f = new FindCommonCharacter();
        String[] words = new String[]{"cool","lock","cook"};
        f.commonChars(words);
    }

}
