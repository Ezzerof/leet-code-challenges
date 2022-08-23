package Easy;

import java.util.Arrays;

public class FindSmallestLetterThanGreaterThanTarger {

    public static char nextGreatestLetter(char[] letters, char target) {
        Arrays.sort(letters);
        char temp = letters[0];
        for (int i = 0; i < letters.length; i++) {
            if ((letters[i] > target)) {
                temp = letters[i];
                break;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        System.out.println(nextGreatestLetter(letters, 'd'));

    }

}
