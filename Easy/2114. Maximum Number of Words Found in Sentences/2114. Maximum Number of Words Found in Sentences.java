//181223 Submission
class Solution {
    public int mostWordsFound(String[] sentences) {
               
        // Approach
        // 1) Initialize output to store answer
        // 2) Loop through sentences. For each iteration, loop through and count " " and add that value to temp output. if temp output + 1 > output, output = temp output + 1
        // 3) Return output

        int output = 0;

        for (String i: sentences) {
            int temp_output = 0;
            for (Character j: i.toCharArray()) {
                if (j.equals(" ")) {
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
    }
}
