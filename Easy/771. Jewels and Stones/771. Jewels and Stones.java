// 090124 Submission
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        // Approach
        // 1) Initialize counter to count no. of jewels
        // 2) Loop through stones to check if each iteration is inside jewels. If it is, counter + 1
        // 3) Return counter

        int counter = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i)) != -1) {
                counter += 1;
            }
        }
        return counter;

        // Test cases
        // 1) Some jewels in stones 
        //    jewels = "aA", stones = "aAAbbbb" -> Returns 3
        // 2) No jewels in stones
        //    jewels = "z", stones = "ZZ" -> Returns 0

        // Runtime = 0ms, beats 100% of users
        // Memory = 41.80MB, beats 17.30% of users
    }
}
