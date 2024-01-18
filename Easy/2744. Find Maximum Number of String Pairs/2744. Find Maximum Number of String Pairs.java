// 180124 Submission
class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        
        // Approach
        // 1) Create a hashset to store iteration of words and their reversed form with no duplicates and initialize answer to store the no. of pairs
        // 2) Loop through words. For each iteration of the word, if it is in set, add 1 to answer. If the reverse of the word is in the set, add 1 to answer. Else, add the word and reversed word into the set
        // 3) Return answer / 2

        HashSet<String> set = new HashSet<>();
        Integer answer = 0;

        for (String word : words) {
            String reversed_word = new StringBuilder(word).reverse().toString();
            if (set.contains(word)) {
                answer += 1;
            }
            if (set.contains(reversed_word)) {
                answer += 1;
            }
            else {
                set.add(word);
                set.add(reversed_word);
            }
        }

        return answer/2;

        // Test Cases
        // 1) words = ["cd","ac","dc","ca","zz"] -> Returns 2

        // Runtime = 3ms, beats 69.56% of users
        // Memory = 44.24MB, beats 18.70% of users
    }
}
