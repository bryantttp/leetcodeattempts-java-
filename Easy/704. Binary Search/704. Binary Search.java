// 060624 Submission

class Solution {
    public int search(int[] nums, int target) {
        // Approach
        // 1) Instantiate a left, right and mid pointer, where mid = length of nums/2
        // 2) while loop (while mid is not equal to left or right)
        // 3) If mid > target, shift right pointer to mid, set mid as left+right/2
        // 4) If mid < target, shift left pointer to mid, set mid as left+right/2
        // 5) If mid == target, return mid
        // 6) Else, return -1

        int left = 0;
        int right = nums.length -1;
        int mid = (left+right)/2;

        while (left < right){
            if (nums[mid] == target){
                return mid;
            }
            else if (nums[mid] > target){
                right = mid - 1;
                mid = (left+right)/2;
            }
            else{
                left = mid + 1;
                mid = (left+right)/2;
            }
        }
        if (nums[mid] == target){
            return mid;
        }
        return -1;

        // Runtime = 0ms, beats 100% of users
        // Memory = 44.78MB, beats 99.33% of users
    }
}
