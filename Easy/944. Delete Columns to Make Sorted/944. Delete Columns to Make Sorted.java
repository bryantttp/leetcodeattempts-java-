// 080224 Submission

class Solution {
    public int minDeletionSize(String[] strs) {
        
        // Approach
        // 1) Initialize counter to store answer
        // 2) Loop through iteration of str based on the index
        // 3) If parseInt of each iteration is smaller than previous, add 1 to answer
        // 4) Return answer

        int counter = 0;

        for (int i = 0; i<strs[0].length();i++) {
            for (int j = 0; j <strs.length-1;j++) {
                if ((int)strs[j].charAt(i) > (int)strs[j+1].charAt(i)){
                    counter += 1;
                    break;
                }
            }
        }
        return counter;

        // Testcases 
        // 1) ["cba","daf","ghi"] -> Returns 1


        // Runtime = 8ms, beats 71.15% of users
        // Memory = 44.09MB, beats 73.11% of users
    }
}
