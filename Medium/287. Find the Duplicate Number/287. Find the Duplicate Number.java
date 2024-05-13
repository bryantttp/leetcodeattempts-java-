// 130524 Submission

class Solution {
    public int findDuplicate(int[] nums) {
        // Approach
        // 1) Use Floyd's Cycle Detection to find the duplicate number
        // 2) We can loop through the list by assigning a fast and slow pointer with the value in the list as the next position, since the values can be from (1,n) inclusive in a n+1 length int list
        // 3) Since there is a number that repeats itself, the list has a cycle within itself as the loop continues, eventually both pointers will meet
        // 4) With Floyd's Cycle Detection, once the pointers meet, either pointer should then be assigned to the first value in the list and both pointers should loop until they meet, which is the start of the cycle, aka the duplicated number

        int slowPointer = nums[0];
        int fastPointer = nums[0];

        slowPointer = nums[slowPointer];
        fastPointer = nums[nums[fastPointer]];

        while (slowPointer != fastPointer){
            slowPointer = nums[slowPointer];
            fastPointer = nums[nums[fastPointer]];
        }

        slowPointer = nums[0];
        while (slowPointer != fastPointer){
            slowPointer = nums[slowPointer];
            fastPointer = nums[fastPointer];
        }
        return fastPointer;

        // Runtime = 4ms, beats 81.92% of users
        // Memory = 57.38MB, beats 78.62% of users
    }   
}
