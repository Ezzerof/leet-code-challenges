package Easy;

import java.util.HashSet;

public class HappyNumber {

    public boolean isHappy(int n) {
        HashSet<Integer> list = new HashSet<>();

        while (n != 1) {
            if (list.contains(n))
                return false;

            list.add(n);
            int sum = 0;

            while (n > 0) {
                int rem = n % 10;
                sum += rem * rem;
                n = n / 10;
            }

            n = sum;
        }

        return true;
    }

}
