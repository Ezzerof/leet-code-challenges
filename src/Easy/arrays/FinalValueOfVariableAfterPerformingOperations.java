package Easy.arrays;

public class FinalValueOfVariableAfterPerformingOperations {
    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;

        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "--X":
                    x -= 1;
                    break;
                case "X--":
                    x -= 1;
                    break;
                case "X++":
                    x += 1;
                    break;
                case "++X":
                    x += 1;
                    break;
            }
        }

        return x;

    }

    public static void main(String[] args) {
        String[] op = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(op));
    }
}
