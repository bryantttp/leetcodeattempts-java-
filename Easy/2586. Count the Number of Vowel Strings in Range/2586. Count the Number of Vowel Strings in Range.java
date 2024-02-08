// 080224
class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        
        // Approach 
        // 1) Initialize counter to count answer
        // 2) Loop through each string in words based on left and right. Use regex to check for starting and ending vowels, if matched, counter += 1
        // 3) Return counter

        int counter = 0;

        for (int i = left;i<=right;i++) {
            if (words[i].matches("^[aeiou].*") && words[i].matches(".*[aeiou]$")) {
                    counter += 1;
            }
        }
        return counter;

        // Testcases
        // 1) ["are","amy","u"] -> returns 2

        // Runtime = 11ms, beats 7.36% of users
        // Memory = 45.01MB, beats 6.12% of users

        // Probably will be faster with manual checks without using regex

    }
}
