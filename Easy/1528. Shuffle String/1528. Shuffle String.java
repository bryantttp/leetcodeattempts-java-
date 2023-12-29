//291223 Submission
class Solution {
    public String restoreString(String s, int[] indices) {

        // Approach
        // 1) Initialize Stringbuilder to combine all chars 
        // 2) Initialize list of chars with length of s (So that you can store the chars at different positions)
        // 3) Loop through length of s. For each iteration, list of chars [indices[i]] = char in s at position i
        // 4) Append list of chars to stringbuilder and convert it to a string using .toString

        StringBuilder answer = new StringBuilder("");
        char chars[] = new char [s.length()];

        for (int i = 0; i < s.length();i++) {
            chars[indices[i]] = s.charAt(i);
        }
        answer.append(chars);
        return answer.toString();

        // Test cases
        // 1) s = "codeleet", indices = [4,5,6,7,0,2,1,3] -> Returns "leetcode"
        
        // Runtime = 3ms, beats 24.39% of users
        // Memory = 44.33MB, beats 11.21% of users
    }
}
