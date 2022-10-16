package Easy.arrays;

public class RichestCustomerWealth {

    public int maximumWealth(int[][] accounts) {

        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            int tempWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                tempWealth += accounts[i][j];
            }
            if (maxWealth < tempWealth) {
                maxWealth = tempWealth;
            }
        }

        return maxWealth;
    }

    public static void main(String[] args) {
        RichestCustomerWealth r = new RichestCustomerWealth();
    }
}

