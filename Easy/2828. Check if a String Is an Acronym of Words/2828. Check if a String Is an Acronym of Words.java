// 030124 Submission
class Solution {
    public boolean isAcronym(List<String> words, String s) {
        
        // Approach
        // 1) Check if length of words is equal to length of s
        // 2) If true, loop through words. if char in words.get(i).charAt(0) is not equal to s.charAt(i), return false. Else, return true
        // 3) Return false

        if (words.size() == s.length()) {
            for (int i = 0; i < s.length(); i++) {
                if (words.get(i).charAt(0) != (s.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;

        // Test cases
        // 1) s is an acronym of words
        //    words = ["alice","bob","charlie"], s = "abc" -> Returns true
        // 2) s is not an acronym of words
        //    words = ["an","apple"], s = "a" -> Returns false

        // Runtime = 3 ms, beats 36.24% of users 
        // Memory = 44.47MB, beats 14.81% of users
    }
}
