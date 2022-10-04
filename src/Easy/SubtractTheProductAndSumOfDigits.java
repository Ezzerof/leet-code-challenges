package Easy;

public class SubtractTheProductAndSumOfDigits {

    public int subtractProductAndSum(int n) {

        String str = String.valueOf(n);
        int product = 1;
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            product *= Integer.parseInt(String.valueOf(ch));
            sum += Integer.parseInt(String.valueOf(ch));
        }

        return product - sum;
    }

}
