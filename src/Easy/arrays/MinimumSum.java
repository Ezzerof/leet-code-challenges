package Easy.arrays;

import java.util.Arrays;

public class MinimumSum {

    public int minimumSum(int num) {

        int sum = 0;
        int index = 0;

        int[] arr = new int[4];

        while (num > 0) {
            arr[index++] = num % 10;
            num /= 10;
        }

        Arrays.sort(arr);

        sum += (arr[0] * 10) + arr[2];
        sum += (arr[1] * 10) + arr[3];

        return sum;
    }

    public static void main(String[] args) {
        MinimumSum m = new MinimumSum();
        System.out.println(m.minimumSum(2932));
    }

}
