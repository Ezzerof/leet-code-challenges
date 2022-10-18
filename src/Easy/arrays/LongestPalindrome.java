package Easy.arrays;

public class LongestPalindrome {
    public static int longestPalindrome(String s) {

        String originalS = s;
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        int count = 0;

        for (int i = 0; i < originalS.length(); i++) {
            if (originalS.charAt(i) == sb.charAt(i)) {
                ++count;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        String s = "abccccdd";

        longestPalindrome(s);
    }
}
