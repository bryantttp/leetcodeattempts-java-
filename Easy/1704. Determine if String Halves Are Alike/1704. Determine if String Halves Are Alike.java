//301223 Submission
class Solution {
    public boolean halvesAreAlike(String s) {

        // Approach
        // Approach
        // 1) Initialize a list of vowels
        // 2) Loop through s. Initialize 2 counters, one to count vowels at first half and another to count vowels at 2nd half.
        // 3) If count of both is same, return True, else false

        String vowels = "aeiouAEIOU";
        int start_counter = 0;
        int end_counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i >= s.length()/2) {
                if (vowels.indexOf(s.charAt(i)) != -1) {
                    end_counter += 1;
                }
            }
            else {
                if (vowels.indexOf(s.charAt(i)) != -1) {
                    start_counter += 1;
                }
            }
        }

        if (start_counter == end_counter) {
            return true;
        }
        else {
            return false;
        }
        
        // Test cases
        // 1) s = "book" -> Returns true

        // Runtime = 8ms, beats 24.45% of users
        // Memory = 41.40MB, beats 26.89% of users
    }
}
