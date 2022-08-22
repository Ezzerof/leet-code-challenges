package Easy;

public class ReverseString {

    public static void reverseString(char[] s) {

        int start = 0;
        int last = s.length -1;

        while (start <= last) {
            char temp = s[start];
            s[start] = s[last];
            s[last] = temp;
            start++;
            last--;
        }

        for (char c : s)
            System.out.println(c);

    }

    public static void main(String[] args) {
        char[] t = {'H','e','l','l','o'};
        reverseString(t);
    }

}
