package Easy;

public class TruncateSentence {

    public String truncateSentence(String s, int k) {

        String result = "";

        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            result += words[i] + " ";
        }

        return result.trim();
    }



}
