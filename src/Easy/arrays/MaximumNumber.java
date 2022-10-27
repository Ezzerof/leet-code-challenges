package Easy.arrays;

public class MaximumNumber {

    public int maximum69Number (int num) {

        if (num == 0) {
            return 9999;
        }

        String strNum = String.valueOf(num);
        char[] arr = strNum.toCharArray();

        for (int j = 0; j < arr.length; j++) {
            char c = strNum.charAt(j);
            if (c == '6') {
                arr[j] = '9';
                break;
            }
        }


        return Integer.parseInt(String.valueOf(arr));
    }

    public static void main(String[] args) {
        MaximumNumber m = new MaximumNumber();
        System.out.println(m.maximum69Number(669));
    }

}
