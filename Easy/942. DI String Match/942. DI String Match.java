// 280124 Submission

class Solution {
    public int[] diStringMatch(String s) {
        
        // Approach
        // 1) Initialize an array of s.length() + 1
        // 2) Initialize start and end counter, where start = 0 and end = s.length()
        // 3) Loop through s.length() + 1. if character is 'I', result[iteration] = start and start += 1. else, result[iteration] = end and end -= 1.
        // 4) Add the last digit using result[s.length()] = start/end
        // 5) Return array

        int[] answer = new int[s.length() + 1];
        int start = 0;
        int end = s.length();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                answer[i] = start;
                start += 1;
            }
            else {
                answer[i] = end;
                end -= 1;
            }
        }
        answer[s.length()] = start;
        return answer;

        // Test case
        // 1) s = "IDID" -> Returns [0,4,1,3,2]

        // Runtime = 3ms, beats 60.55% of users
        // Memory = 44.75 MB, beats 87.77% of users
    }
}
