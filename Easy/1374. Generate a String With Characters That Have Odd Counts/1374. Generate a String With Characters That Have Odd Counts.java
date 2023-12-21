// 211223 Submission
class Solution {
    public String generateTheString(int n) {

        // Approach
        // 1) Initialize a string to store answer
        // 2) Check if n is even or odd. If n = 1, add "a" to String
        // 3) If even, loop (n-1) times and add "a" then add "b" to String
        // 4) If odd, loop n times and add "a"

        String answer = "";

        if (n == 1) {
            answer = "a";
        }

        if (n%2 == 0) {
            for (int i = 0; i < (n-1); i++) {
                answer += "a";
            }
            answer += "b";
        }

        if (n%2 == 1 && n != 1) {
            for (int i = 0; i < n; i++) {
                answer += "a";
            }
        }

        return answer;

        // Test cases:
        // 1) n is odd
        //    n = 3 -> Returns "aaa"
        // 2) n is even
        //    n = 4 -> Returns "aaab"

        // Runtime = 4ms, beats 24.68% of users
        // Memory = 44.55MB, beats 6.45% of users
        
    }
}
