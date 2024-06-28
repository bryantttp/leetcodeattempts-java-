// 280624 Submission
class Solution {
    public int findMin(int[] nums) {
        // Approach
        // 1) Implement Binary Search
        // 2) While Left < Right
        // 3) If value of Mid > value of Left and value of Mid < value of Right, Right = mid
        // 4) If value of Mid < value of left and value of Right, Left += 1, right -= 1
        // 5) If value of Mid > value of Left and Right, Left = Mid
        // 6) There are other possiblities but due to the nature of the sorted array, it is impossible to reach them
        // 7) Return left

        int left = 0;
        int right = nums.length - 1;
        while (left < right){
            int mid = left + (right-left)/2;
            if (mid == left){
                break;
            }
            if ((nums[mid] > nums[left]) && (nums[mid] < nums[right])){
                right = mid;
            }
            else if ((nums[mid] < nums[left]) && (nums[mid] < nums[right])){
                left += 1;
                right -= 1;
            }
            else if ((nums[mid] > nums[left]) && (nums[mid] > nums[right])){
                left = mid;
            }  
        }
        if (nums[left] > nums[right]){
            return nums[right];
        }
        else{
            return nums[left];  
        }
    }

    // Runtime = 0ms, beats 100% of users
    // Memory = 41.53MB, beats 88.17% of users
}
