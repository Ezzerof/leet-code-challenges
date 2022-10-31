package Easy;

public class AddBinary {

    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (i >= 0) sum += b.charAt(j--) - '0';

            res.append(sum % 2);
            carry = sum / 2;
        }

        if (carry != 0) res.append(carry);

        return res.reverse().toString();
    }

    public static void main(String[] args) {
        AddBinary a = new AddBinary();
        System.out.println(a.addBinary("10", "1")); //  100
    }

}
