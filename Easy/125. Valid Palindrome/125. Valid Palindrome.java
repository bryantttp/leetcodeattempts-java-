// 050424 Submission

class Solution {
    public boolean isPalindrome(String s) {
        // Approach
        // 1) Use one pointer that starts from the first index and moves forwards and another that starts from the end and moves backwards
        // 2) Loop through half of the string and check if the current character is a letter or digit, if it is not, move the pointer forward or backward depending on the pointer
        // 3) Else, check if both characters are not equal, if true , return false. In this else condition, add 1 and minus 1 according to the pointer type
        // 4) Once out of the loop, return true

        int forwardPointer = 0;
        int backwardPointer = s.length()-1;
        while (forwardPointer <= backwardPointer){ // This allows the loop to move towards the center of the string
            if (!Character.isLetterOrDigit(s.charAt(forwardPointer))){
                forwardPointer += 1;
            }
            else if (!Character.isLetterOrDigit(s.charAt(backwardPointer))){
                backwardPointer -= 1;
            }
            else {
                if (Character.toLowerCase(s.charAt(forwardPointer)) != Character.toLowerCase(s.charAt(backwardPointer))){
                    return false;
                }
                forwardPointer += 1;
                backwardPointer -= 1;
            }
        }
        return true;

        // Runtime = 2ms, beats 98.94% of users
        // Memory = 42.78MB, beats 78.94% of users
    }
}
