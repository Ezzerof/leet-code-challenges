package Easy;

public class ClimbingStairs {

    public int climbStairs(int n) {
        int steps = 0;
        int first = 0;
        int second = 1;

        for (int i = 0; i < n; i++) {
            steps = first + second;
            first = second;
            second = steps;
        }

        return steps;
    }

}
