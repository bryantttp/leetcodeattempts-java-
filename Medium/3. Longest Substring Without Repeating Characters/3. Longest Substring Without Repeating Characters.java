// 030924 Submission

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Approach
        // 1) Account for length of 0 or 1, return the same input
        // 2) For normal cases, create a hashmap and iterate through string. Create a pointer as well
        //    to track the max length of the substring
        // 3) For each element, check if it exists in the hashmap.
        //    If it does, shift the pointer to 1 space after the previous element's index, if it is
        //    smaller than it
        // 4) Add the character and its index to the hashmap
        // 5) Save the max substring length in an int variable

        if (s.length() == 0 || s.length() == 1){
            return s.length();
        }
        Map<Character,Integer> dict = new HashMap<>();
        int max = 0;
        int pointer = 0;
        for (int i = 0; i < s.length(); i++){
            if (dict.containsKey(s.charAt(i))){
                pointer = Math.max(pointer,dict.get(s.charAt(i))+1);
            }
            dict.put(s.charAt(i),i);
            max = Math.max(max, i - pointer + 1);
        }
        return max;

        // Runtime = 5ms, beats 86.81% of users
        // Memory = 44.52MB, beats 58.86% of users
    }
}
