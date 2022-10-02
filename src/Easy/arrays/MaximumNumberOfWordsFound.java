package Easy.arrays;

public class MaximumNumberOfWordsFound {

    public static int mostWordsFound(String[] sentences) {

        int words = 0;

        for (String sentence : sentences) {
            int len = sentence.length();
            int wordCounter = 1;

            for (int i = 0; i < len; i++) {
                if (sentence.charAt(i) == ' ') {
                    wordCounter++;
                }
            }
            if (words < wordCounter)
                words = wordCounter;
        }

        return words;
    }

}
