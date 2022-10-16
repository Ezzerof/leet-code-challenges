package Easy.string;

public class SplitStringInBalancedString {

    public int balancedStringSplit(String s) {

        int lCount = 0, sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                lCount++;
            } else {
                lCount--;
            }

            if (lCount == 0) {
                sum++;
            }
        }

        return sum;

    }

}
