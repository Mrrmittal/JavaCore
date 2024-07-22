package Main.ProblemSolvingPractice.Arrays;

public class FindDuplicateNumber {

    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }


    public static void main(String[] args) {
        FindDuplicateNumber obj = new FindDuplicateNumber();
        int num[] = {7,6,4,3,1,8};
        System.out.println(obj.maxProfit(num));
    }
}
