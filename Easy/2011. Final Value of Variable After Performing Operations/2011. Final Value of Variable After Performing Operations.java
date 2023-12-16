// 161223 Submission
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        
        // Approach:
        // 1) Initialize output to store answer
        // 2) Loop through operations. If iteration == "--X" or "X--", output -= 1, else output += 1
        // 3) Return output
        int output = 0;
        for(int i=0;i<operations.length;i++) {
            if (operations[i].equals("--X") || operations[i].equals("X--")) {
                output -= 1;
            }
            else {
                output += 1;
            }
        }
        return output;

        // Test cases:
        // 1) operations = ["--X","X++","X++"] -> Return 1

        // Runtime = 1ms, beats 73.69% of users
        // Memory = 41.86MB, beats 29.17% of users

    }
}
