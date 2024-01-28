// 280124 Submission
class Solution {
    public int prefixCount(String[] words, String pref) {
        
        // Approach
        // 1) Initialize a counter to count the number of words that contain prefix
        // 2) Loop through words. For each word, check if length of word is more than or equal to length of prefix. If it is, for the length of prefix, check if each character at each index is equal to that of prefix. If so, add 1 to counter
        // 3) Return counter

        int counter = 0;
        for (String word : words) {
            double counter2 = 0;
            if (word.length() >= pref.length()) {
                for (int i = 0; i < pref.length(); i++) {
                    if (word.charAt(i) == (pref.charAt(i))) {
                        counter2 += 1;
                    }
                }
            }
            counter2 = counter2 / pref.length();
            if (counter2 == 1) {
                counter += 1;
            }
                
        }
        return counter;
        }
        

        // Test cases:
        // 1) words = ["pay","attention","practice","attend"], pref = "at" -> Returns 2

        // Runtime = 5ms, beats 12.81% of users
        // Memory = 42.69MB, beats 63.61% of users
    }
