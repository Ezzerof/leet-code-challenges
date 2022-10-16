package Easy.string;

public class SortingSentence {

    public String sortSentence(String s) {

        String[] sentenceArr = s.split(" ");
        String[] newSentence = new String[sentenceArr.length];

        for (String word : sentenceArr) {
            int i = Character.getNumericValue(word.charAt(word.length()-1));
            newSentence[i - 1] = word.substring(0, word.length() - 1);
        }

        return String.join(" ", newSentence);
    }

    public static void main(String[] args) {
        SortingSentence st = new SortingSentence();
        System.out.println(st.sortSentence("is2 sentence4 This1 a3"));
    }

}
