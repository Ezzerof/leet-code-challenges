package Easy.string;

import java.util.Arrays;

public class SortingSentence {

    public String sortSentence(String s) {

        String[] sentenceArr = s.split(" ");
        int currentDigit;
        int nextDigit;

        boolean isOn = true;

        while (isOn) {
            isOn = false;
            for (int i = 0; i < sentenceArr.length - 1; i++) {

                currentDigit = findNumber(sentenceArr[i]);
                nextDigit = findNumber(sentenceArr[i + 1]);

                if (currentDigit > nextDigit) {
                    isOn = true;
                    String temp = sentenceArr[i];
                    sentenceArr[i] = sentenceArr[i + 1];
                    sentenceArr[i + 1] = temp;
                }

            }
        }
        String result = "";

        for (String st : sentenceArr) {
            result += st.replaceAll("[0-9]", "") + "";
        }

        return result.trim();
    }

    public int findNumber(String word) {
        int num = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isDigit(ch)) {
                num = Integer.parseInt(String.valueOf(ch));
            }
        }

        return num;
    }


    public static void main(String[] args) {
        SortingSentence st = new SortingSentence();
        System.out.println(st.sortSentence("is2 sentence4 This1 a3"));
    }

}
