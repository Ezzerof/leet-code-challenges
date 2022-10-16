package Easy;

import java.util.HashMap;

public class GoalParserInterpretation {

    public static String interpret(String command) {
        String result = "";

        for (int i = 0; i < command.length(); i++) {
            char ch = command.charAt(i);
            String temp = String.valueOf(ch);
            if (temp.equals("(")) {
                int j = i + 1;
                char ch2 = command.charAt(j);
                String next = String.valueOf(ch2);
                if (next.equals(")")) {
                   result += "o";
                   i += 1;
                } else if (next.equals("a")) {
                    result += "al";
                    i += 3;
                }
            } else {
                result += "G";
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(interpret("(al)G(al)()()G"));
    }

}
