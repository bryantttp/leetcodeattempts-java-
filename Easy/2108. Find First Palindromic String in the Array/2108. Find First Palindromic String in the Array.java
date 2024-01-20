// 200124 Submission
class Solution {
    public String firstPalindrome(String[] words) {

        // Approach
        // 1) Loop through words. Initialize stringbuilder to get reversed version of string
        // 2) Check if word is palindrome and return that if it is
        
        int counter = -1;

        for (int i = 0; i < words.length; i++) {
            StringBuilder reversed_word = new StringBuilder(words[i]);
            reversed_word = reversed_word.reverse();
            if (words[i].equals(reversed_word.toString())) {
                counter = i;
                break;
            } 
        }
        if (counter == -1) {
            return "";
        }
        else {
            return words[counter];
        }

        // Test case
        // 1) words = ["abc","car","ada","racecar","cool"] -> Returns "ada"
        
    }
}
