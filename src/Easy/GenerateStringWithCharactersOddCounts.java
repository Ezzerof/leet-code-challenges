package Easy;

public class GenerateStringWithCharactersOddCounts {

    public String generateTheString(int n) {

        StringBuilder result = new StringBuilder();

        if (n % 2 == 0) {
            n--;
            result.append("a");
        }

        while (n > 0) {
            result.append("b");
            n--;
        }

        return result.toString();
    }

}
