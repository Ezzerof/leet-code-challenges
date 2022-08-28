package Easy.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {

        //Version 1

//        ArrayList<Integer> allPrices = (ArrayList<Integer>)
//                Arrays.stream(prices).boxed().collect(Collectors.toList());
//
//        int minPrice = prices[0];
//        int maxProfit = 0;
//        int todayProfit = 0;
//
//        for (int i = 0; i < allPrices.size(); i++) {
//            if (allPrices.get(i) < minPrice) {
//                minPrice = allPrices.get(i);
//            }
//
//            todayProfit = allPrices.get(i) - minPrice;
//            if (maxProfit < todayProfit) {
//                maxProfit = todayProfit;
//            }
//        }
//
//        return maxProfit;


        int profit = 0;
        int todayProfit;
        int smallest = prices[0];

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < smallest) {
                smallest = prices[i];
            }

            todayProfit = prices[i] - smallest;
            if (profit < todayProfit) {
                profit = todayProfit;
            }
        }

        return profit;

    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        System.out.println(maxProfit(prices));
    }
}
