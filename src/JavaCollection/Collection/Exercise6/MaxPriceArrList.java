package JavaCollection.Collection.Exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// bài này chưa hiểu lắm. tham khảo chat gpt
public class MaxPriceArrList {

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("input number of days: ");
        int n = sc.nextInt();
        List<Integer> prices = new ArrayList<>();

        System.out.println("input the stock prices for each day: ");
        for (int i = 0; i < n; i++) {
            prices.add(sc.nextInt());
        }

        // tính lợi nhuận max
        int profit = maxProfit(prices);
        System.out.println("max profit: " + profit);
        sc.close();

    }

    public int maxProfit(List<Integer> prices) {
        if (prices.size() < 2) return 0;

        int minPrice = prices.get(0);
        int maxProfit = 0;

        for (int i = 1; i < prices.size(); i++) {
            int price = prices.get(i);

            if (price < minPrice) {
                minPrice = price;
            } else {
                int profit = price - minPrice;
                if(profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }



    public static void main(String[] args) {
        MaxPriceArrList maxPriceArrList = new MaxPriceArrList();
        maxPriceArrList.run();
    }
}
