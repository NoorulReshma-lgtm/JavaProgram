import java.util.Scanner;

public class StockBuySell {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of days: ");
        int n = sc.nextInt();

        int[] price = new int[n];

        System.out.println("Enter stock prices:");
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }

        int minPrice = price[0];
        int maxProfit = 0;
        int buyDay = 0;
        int sellDay = 0;
        int tempBuy = 0;

        for (int i = 1; i < n; i++) {

            if (price[i] < minPrice) {
                minPrice = price[i];
                tempBuy = i;
            }

            if (price[i] - minPrice > maxProfit) {
                maxProfit = price[i] - minPrice;
                buyDay = tempBuy;
                sellDay = i;
            }
        }

        if (maxProfit > 0) {
            System.out.println("Buy on Day: " + buyDay);
            System.out.println("Sell on Day: " + sellDay);
            System.out.println("Maximum Profit = " + maxProfit);
        } else {
            System.out.println("No Profit Possible.");
        }

        sc.close();
    }
}
