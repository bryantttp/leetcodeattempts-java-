// 100324 Submission

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        // Approach
        // 1) Instantiate answer array with length similar to nums and a variable to store products of previous values, start with value of 1
        // 2) Fill answer array with 1 so that it would not multiply to zero or have an error
        // 3) Loop through length of array (either). Multiply current index of ans array with the variable, variable multiply by the current index of nums
        // 4) Loop through length of array (either) in reverse. Multiply current index of ans array with the variable, variable multiply by the current index of nums
        // 5) Return answer array

        int[] answer = new int[nums.length];
        int tempCounter = 1;
        Arrays.fill(answer,1);

        for (int i = 0; i < nums.length; i++){
            answer[i] *= tempCounter;
            tempCounter *= nums[i];
        }     
        tempCounter = 1;
        for (int i = nums.length-1; i >= 0 ; i--){
            answer[i] *= tempCounter;
            tempCounter *= nums[i];
        }

        return answer;

        // Runtime = 2ms, beats 73.83% of users
        // Memory = 52.74MB, beats 91.58% of users 

    }
}
