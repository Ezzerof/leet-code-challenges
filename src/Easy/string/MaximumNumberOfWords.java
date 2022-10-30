package Easy.string;

public class MaximumNumberOfWords {

    public int canBeTypedWords(String text, String brokenLetters) {

        String[] words = text.split(" ");
        String[] bLetters = brokenLetters.split("");
        int count = 0;

        if (brokenLetters.isEmpty()) {
            return words.length;
        }

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < bLetters.length; j++) {
                if (words[i].contains(bLetters[j])) {
                    count++;
                    break;
                }
            }
        }

        return words.length - count;
    }

    public static void main(String[] args) {
        MaximumNumberOfWords ma = new MaximumNumberOfWords();
        System.out.println(ma.canBeTypedWords("abc de", ""));
    }

}
