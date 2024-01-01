// 020124 Submission
class Solution {
    public String truncateSentence(String s, int k) {
        
        // Approach
        // 1) Initialize a stringbuilder to store the answer
        // 2) Loop through s. For each iteration, check if iteration is a space. If it is, k -= 1. If k > 0, add iteration to stringbuilder
        // 3) Use toString to convert it to a string, return this as the answer

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                k -= 1;
            }
            if (k>0) {
                answer.append(ch);
            }
        }
        return answer.toString();

        // Test cases
        // 1) s = "Hello how are you Contestant", k = 4 -> Returns "Hello how are you"

        // Runtime = 2ms, beats 48.93% of users
        // Memory = 41.48MB, beats 40.46% of users
    }
}
