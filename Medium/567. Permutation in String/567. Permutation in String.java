// 061224 Submission
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // Approach
        // 1) Instantiate 2 int array to store the count of letters of s1 and s2
        // 2) Loop through s1 and s2 up to the length of s1, to store the count of each letter in the new int array
        // 3) Instantiate a int to count the number of matches in s1 int array with s2
        // 4) Continue looping through s2, starting from length of s1 using the sliding window technique, updating the count when removing the previous letter and adding the new one in
        // 5) return matches == 26 (Add this check in the loop to end the loop earlier)

        if (s1.length() > s2.length()){
            return false;
        }

        int [] s1Count = new int[26];
        int [] s2Count = new int[26];

        for (int i = 0; i < s1.length(); i++){
            s1Count[s1.charAt(i) - 'a'] += 1;
            s2Count[s2.charAt(i) - 'a'] += 1;
        }

        int matches = 0;

        for (int i = 0; i < 26; i ++){
            if (s1Count[i] == s2Count[i]){
                matches += 1;
            }
        }
        int slidingWindowStartIndex = 0;
        for (int i = s1.length(); i<s2.length(); i ++){
            if (matches == 26){
                return true;
            }
            char slidingWindowOldStartChar = s2.charAt(slidingWindowStartIndex);
            char slidingWindowNewEndChar = s2.charAt(i);
            boolean slidingWindowStartCharCheck = s1Count[slidingWindowOldStartChar - 'a'] == s2Count[slidingWindowOldStartChar - 'a'];
            boolean slidingWindowEndCharCheck = s1Count[slidingWindowNewEndChar - 'a'] == s2Count[slidingWindowNewEndChar - 'a'];
            s2Count[slidingWindowOldStartChar - 'a'] -= 1;
            s2Count[slidingWindowNewEndChar - 'a'] += 1;

            if (slidingWindowStartCharCheck == false && s1Count[slidingWindowOldStartChar - 'a'] == s2Count[slidingWindowOldStartChar - 'a']){
                matches += 1;
            }
            else if (slidingWindowStartCharCheck == true && s1Count[slidingWindowOldStartChar - 'a'] != s2Count[slidingWindowOldStartChar - 'a']){
                matches -= 1;
            }
            if (slidingWindowEndCharCheck == false && s1Count[slidingWindowNewEndChar - 'a'] == s2Count[slidingWindowNewEndChar - 'a']){
                matches += 1;
            }
            else if (slidingWindowEndCharCheck == true && s1Count[slidingWindowNewEndChar - 'a'] != s2Count[slidingWindowNewEndChar - 'a']){
                matches -= 1;
            }
            slidingWindowStartIndex += 1;
        }
        return matches == 26;
    }

    // Runtime = 10ms, beats 42.65%
    // Memory = 43.00MB, beats 37.65%
}
