// 010724 Submission
class Solution {
    public int search(int[] nums, int target) {
        // Approach
        // 1) Custom binary search
        // 2) Instantiate left, mid and right pointers
        // 3) If value of left < value of mid and value of mid < value of right, check if target is <= or > than value of mid
        // 4) If <, shift right to mid, else shift left to mid + 1
        // 5) If value of mid < value of left && right, check if target is between mid and right.
        // 6) If it is, shift left to mid. Else, shift right to mid
        // 7) If value of mid > value of left && right, check if target is between left and mid.
        // 8) If it is, shift right to mid. Else, shift left to mid.
        // 9) After while loop, if target != left, return -1, else return left

        int left = 0;
        int right = nums.length-1;

        while (left < right){
            int mid = left + (right-left)/2;
            if (nums[right] == target){
                return right;
            }
            if (nums[mid] == target){
                return mid;
            }
            if (nums[left] == target){
                return left;
            }
            if (nums[left] <= nums[mid]){
                if (target >= nums[left] && target < nums[mid]){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
            else {
                if (target > nums[mid] && target <= nums[right]){
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
            }
        }
        if (target != nums[left]){
            return -1;
        }
        else{
            return left;
        }
    }
    // Runtime = 0ms, beats 100% of users
    // Memory = 41.79MB, beats 69.99% of users
    
}
