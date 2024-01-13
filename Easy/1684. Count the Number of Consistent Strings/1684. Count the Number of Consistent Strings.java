// 130124 Submission

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {

        // Approach
        // 1) Initialize output using size of words
        // 2) Loop through words. For each iteration, loop through to check if each letter is in allowed. If it is not, output - 1.
        // 3) Return output

        int output = words.length;

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (allowed.indexOf(word.charAt(i)) == -1) {
                    output -= 1;
                    break;
                }
            }
        }
        return output;

        // Test cases
        // 1) allowed = "ab", words = ["ad","bd","aaab","baa","badab"] -> Returns 2
        // 2) allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"] ->   Returns 7

        // Runtime = 15ms, beats 49.60% of users
        // Memory = 45.35MB, beats 23.72% of users
        
    }
}
