// 180624 Submission

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // Approach
        // 1) Binary Search to check the minimum integer 
        // 2) Use 1 as the min integer and max value in piles as the max integer ( in this scenerio, max h is 10^9)
        // 3) Divide the each int in piles to check the time taken for koko to eat the piles of bananas
        // 4) If the total value is less than h, shift right pointer to mid -1
        // 5) If the total value is more than h, shift left pointer to mid + 1
        // 6) Repeat as long as left <= right

        int left = 1;
        int right = 1000000000;

        while (left <= right){
            int mid = left + (right-left)/2;
            if ((right-left)%2 != 0){
                mid += 1;
            }
            int timeTaken = 0;
            for (int i : piles){
                timeTaken += i/mid;
                if (i % mid != 0){
                    timeTaken += 1;
                }
            }
            if (timeTaken > h){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return left;

        // Runtime = 13ms, beats 74.99% of users
        // Memory = 45.05MB, beats 36.91% of users
    }
}
