// 080224 Submission
class Solution {
    public int countSeniors(String[] details) {
        
        // Approach
        // 1) Initialize a counter to store answer
        // 2) Loop through each iteration and check the 11th - 12th index for the age of person.
        // 3) If age > 60, counter += 1
        // 4) Return counter

        int answer = 0;

        for (String passenger : details) {
            if( Integer.parseInt(passenger.substring(11,13)) > 60) {
                answer += 1;
            }
        }

        return answer;


        // Testcases
        // 1) ["7868190130M7522","5303914400F9211","9273338290F4010"] -> Returns 2

        // Runtime = 1ms, beats 83.27% of users
        // Memory = 42.40MB, beats 66.93% of users
    }
}
