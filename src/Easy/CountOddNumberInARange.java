package Easy;

public class CountOddNumberInARange {

    public int countOdds(int low, int high) {
        int temp = high - low + 1;

        if  (temp % 2 == 0) { // if high - low + 1 is even
            temp /= 2;
        } else {
            if  (low % 2 == 0) { // if low is even
                temp /= 2;
            } else {
                temp = (temp / 2) + 1;
            }
        }

        return temp;
    }
}
