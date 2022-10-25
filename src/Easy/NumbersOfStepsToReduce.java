package Easy;

public class NumbersOfStepsToReduce {

    public int numberOfSteps(int num) {
        int count = 0;

        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
                count++;
            } else {
                num--;
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        NumbersOfStepsToReduce n = new NumbersOfStepsToReduce();
        System.out.println(n.numberOfSteps(8));
    }

}
