// 021024 Submission
class Solution {
    public int characterReplacement(String s, int k) {
        // Records the number of each character in the window
        int[] arr = new int[26];
        int result = 0;
        int max = 0;

        int l = 0;
        for (int r=0; r <s.length(); r++){
            arr[s.charAt(r) - 'A']++;

            // This records the most dominant character in the current window
            max = Math.max(max, arr[s.charAt(r) - 'A']);

            // This checks whether the difference between the number of the dominant character and the window size is more than k, meaning that there isn't enough substitution
            if (r - l + 1 - max > k){
                // Decrementing the count of the character as it is no longer in the windoow
                arr[s.charAt(l)-'A']--;
                l++;
            }
            result = Math.max(result, r-l+1);
        }
        return result;

        // Runtime = 10ms, beats 66.47% of users
        // Memory = 42.48MB, beats 63.27% of users
    }
}
