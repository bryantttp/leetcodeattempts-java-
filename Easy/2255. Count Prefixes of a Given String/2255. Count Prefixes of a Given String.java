// 080224 Submission
class Solution {
    public int countPrefixes(String[] words, String s) {
        
        // Approach
        // 1) Initialize counter to store answer
        // 2) Loop through words. For each iteration, use regex to check if s starts with the iteration. If it does, counter += 1
        // 3) Return answer

        int counter = 0;
        for (String word : words){
            if(s.matches(word + ".*")){
                counter += 1;
            }
        }
        return counter;

        // Testcases
        // 1) words = ["a","b","c","ab","bc","abc"], s = "abc" -> Returns 3

        // Runtime = 16ms, beats 7.75% of users
        // Memory = 45.54MB, beats 5.21% of users

        // using startsWith() runs much faster than regex

    }
}
