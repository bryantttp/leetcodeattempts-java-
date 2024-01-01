// 020124 Submission
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        // Approach
        // 1) Use String.join() function to convert word1 and word2 into strings
        // 2) Return true if their strings are equal and false otherwise

        String word1_joined = String.join("",word1);
        String word2_joined = String.join("",word2);

        if (word1_joined.equals(word2_joined)){
            return true;
        }
        return false;

        // Test cases
        // 1) word1 and word2 are the same
        //    word1 = ["a", "cb"], word2 = ["ab", "c"] -> Returns true
        // 2) word1 and word2 are not the same
        //    word1 = ["a", "cb"], word2 = ["ab", "c"] -> Returns false

        // Runtime = 1ms, beats 68.99% of users
        // Memory = 41.99MB, beats 6.85% of users

    }
}
