package Easy.arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;

        for (int i = 0; i < candies.length; i++) {
            if (max < candies[i])
                max = candies[i];
        }

        for (int i = 0; i < candies.length; i++) {
            candies[i] += extraCandies;
            if (candies[i] >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }

}
