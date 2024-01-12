//120124 Submission
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        // Approach
        // 1) Initialize an array of the morse code
        // 2) Create a hashset to add converted words (does not allow for duplicates)
        // 3) Loop through words. For each iteration, loop through word. Create a temp string using stringbuilder to add each converted letter. After looping through the word, add it to the hashset
        // 4) Return size of hashset
        String[] codes = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        HashSet<String> answer = new HashSet();

        for (String word : words) {
            StringBuilder temp_string = new StringBuilder();
            for (int i = 0; i < word.length();i++) {
                temp_string.append(codes[(int) word.charAt(i) - (int) 'a']);
            }
            answer.add(temp_string.toString());
        }
        return answer.size();

        // Test cases
        // 1) words = ["gin","zen","gig","msg"] -> Returns 2

        // Runtime = 2ms, beats 92.77% of users
        // Memory = 41.36MB, beats 39.30% of users
    }
}
