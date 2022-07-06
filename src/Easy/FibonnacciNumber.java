package Easy;

import java.util.Scanner;

public class FibonnacciNumber {
    public static int fib(int n){
        int temp = 0;
        int temp1 = 1;
        int temp2 = 0;

        if (n == 0){
            return 0;
        } else if (n == 1){
            return 1;
        }

        for (int i = 1; i < n; i++) {
            temp = temp1 + temp2;
            temp2 = temp1;
            temp1 = temp;
        }

        int sum =temp;
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number: ");
        int x;
        System.out.print("The Fibonnacci number is: " + fib(x = input.nextInt()));
    }

}
