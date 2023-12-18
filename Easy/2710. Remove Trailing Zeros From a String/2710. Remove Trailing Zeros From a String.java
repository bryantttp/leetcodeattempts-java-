// 181223 Submission
class Solution {
    public String removeTrailingZeros(String num) {
        
        // Approach
        // 1) Initialize counter to count no. of "0" from the back
        // 2) Loop through num in reverse. If iteration == "0", counter += 1, else break
        // 3) Return num.substring(0,num.length()-counter)

        int counter = 0;

        for (int i = num.length()-1; i >= 0 ;i--) {
            if (num.substring(i,i+1).equals("0")) {
                counter += 1;
            }
            else {
                break;
            }
        }
        return num.substring(0,num.length()-counter);
 
        // Test cases
        // 1) No 0 at the back
        //    num = "123" -> Returns "123"
        // 2) Some 0s at the back
        //    num = "51230100" -> Returns "512301"

        // Runtime = 4ms, beats 26.82% of users
        // Memory = 44.26MB, beats 12.27% of users
        
    }
}
