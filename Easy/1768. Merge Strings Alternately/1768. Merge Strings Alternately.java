// 171223 Submission
class Solution {
    public String mergeAlternately(String word1, String word2) {

        // Approach
        // 1) Initialize output to store answer
        // 2) Check which word is shorter. Loop through shorter len. For each iteration, output += iteration of word1 then word2. Loop from shorter len to longer len. output += iteration from the longer word
        // 3) Return output

        String output = "";

        if (word1.length() > word2.length()){
            for (int i = 0; i < word2.length();i++) {
                output += word1.charAt(i);
                output += word2.charAt(i);
            }
            for (int i = word2.length(); i < word1.length();i++) {
                output += word1.charAt(i);
            }
        }
        else if(word2.length() > word1.length()) {
            for (int i = 0; i < word1.length();i++) {
                output += word1.charAt(i);
                output += word2.charAt(i);
            }
            for (int i = word1.length(); i < word2.length();i++) {
                output += word2.charAt(i);
            }
        }
        else {
            for (int i = 0; i < word1.length();i++) {
                output += word1.charAt(i);
                output += word2.charAt(i);
            }

        }
        return output;
        
        // Test cases
        // 1) Word 1 longer than Word 2
        //    word1 = "abcd", word2 = "pq" -> Returns -> "apbqcd"
        // 2) Word 2 longer than Word 1
        //    word1 = "ab", word2 = "pqrs" -> Returns "apbqrs"
        // 3) Both same length
        //    word1 = "abc", word2 = "pqr" -> Returns "apbqcr"


        // Runtime = 7ms, beats 24.08% of users
        // Memory = 41.83MB, beats 15.78% of users
    }
}
