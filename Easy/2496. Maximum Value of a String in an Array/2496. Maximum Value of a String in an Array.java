// 080224 Submission
class Solution {
    public int maximumValue(String[] strs) {

    // Approach
    // 1) Initialize answer to sum all the values 
    // 2) Loop through strs. Check if alphabet exists, if it does, t_answer = length of iteration. Else, t_answer = parseInt(iteration)
    // 3) If t_answer > answer, answer = t_answer
    // 4) Return answer

    int answer = 0;
    int t_answer = 0;
    for (String s : strs) {
        if (s.matches(".*[a-zA-Z].*")) {
            t_answer = s.length();
        }
        else {
            t_answer = Integer.parseInt(s);
        }
        
        if (t_answer > answer) {
            answer = t_answer;
        } 
    }
    return answer;

    // Testcases
    // 1) strs = ["alic3","bob","3","4","00000"] -> Returns 5

    // Runtime = 7ms, beats 11.11% of users
    // Memory = 42.98MB, beats 7.73% of users

    }
}
