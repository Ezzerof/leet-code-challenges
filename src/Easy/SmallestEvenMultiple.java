package Easy;

public class SmallestEvenMultiple {

    public int smallestEvenMultiple(int n) {
        int result = 0;
        int middle = n/2;

        if ((n % 2 == 0) && (n % n == 0)) {
            result = n;
        } else {
            result = n * 2;
        }
        return result;
    }
}
