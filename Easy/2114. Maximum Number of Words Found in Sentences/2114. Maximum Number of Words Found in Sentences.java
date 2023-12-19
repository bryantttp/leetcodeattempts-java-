//191223 Submission
class Solution {
    public int mostWordsFound(String[] sentences) {
               
        // Approach
        // 1) Initialize output to store answer
        // 2) Loop through sentences. For each iteration, loop through and count " " and add that value to temp output. if temp output + 1 > output, output = temp output + 1
        // 3) Return output

        int output = 0;

        for (String i: sentences) {
            int temp_output = 0;
            for (int j = 0; j < i.length();j++) {
                if (i.substring(j,j+1).equals(" ")) {
                    temp_output += 1;
                }
            }
            if (temp_output + 1 > output) {
                output = temp_output + 1;
            }
        }
        return output;

        // Test cases
        // 1) sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"] -> Returns 6
        // 2) sentences = ["please wait", "continue to fight", "continue to win"] -> Returns 3

        // Runtime = 9ms, beats 8.78% of users
        // Memory = 43.99MB, beats 10.07% of users
    }
}
