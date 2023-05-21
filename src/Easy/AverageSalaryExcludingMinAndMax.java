package Easy;

public class AverageSalaryExcludingMinAndMax {

    public static double average(int[] salary) {

        boolean isSorted = false;
        int len = salary.length - 1;

        for (int i = 0; i < salary.length && !isSorted; i++) {
            isSorted = true;
            for (int j = 1; j < salary.length - i; j++) {
                if  (salary[j] < salary[j - 1]) {
                    int temp = salary[j];
                    salary[j] = salary[j - 1];
                    salary[j - 1] = temp;
                    isSorted = false;
                }
            }
        }

        double total = 0;

        for (int i = 1; i < len; i++) {
            total += salary[i];
        }

        return total / (len - 1);

    }
}
