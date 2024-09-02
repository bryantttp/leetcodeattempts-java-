// 020924 Submission

class Solution {
    public int maxProfit(int[] prices) {
        // Approach
        // 1) Loop through array from 2nd element
        // 2) Instantiate int with the value of the first element in the list
        // 3) Instantiate another int to store the value of the profit
        // 4) In the for loop, each time the price is smaller than the buy price, swap the buy price with that value.
        //    Since the new buy price is smaller, any profit made from subsequent price that is encountered would be 
        //    larger than the prev buy price, thus we can forget about the old buy price and replace it with the lower value
        // 5) Check to see if the profit is bigger than the existing profit
        // 6) Return profit as the answer

        int buyPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++){
            if (prices[i] < buyPrice){
                buyPrice = prices[i];
            }
            else if (prices[i] - buyPrice > maxProfit){
                maxProfit = prices[i] - buyPrice;
            }
        }
        return maxProfit;

        // Runtime = 2ms, beats 71.46% of users
        // Memory = 60.94MB, beats 94.80% of users
    }
}
