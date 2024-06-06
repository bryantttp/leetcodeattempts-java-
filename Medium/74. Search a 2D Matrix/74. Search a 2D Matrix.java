// 060624 Submission
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Approach
        // 1) Loop through matrix and do Binary Search for each iteration

        for (int[] list : matrix){
            int left = 0;
            int right = list.length -1;
            int mid = (left+right)/2;
            if (list[right] < target) {
                continue;
            }
            while (left <= right){
                if (list[mid] == target){
                    return true;
                }
                if (list[left] == target){
                    return true;
                }
                if (list[right] == target){
                    return true;
                } 
                else if (list[mid] > target){
                    right = mid - 1;
                    mid = (left+right)/2;
                }
                else{
                    left = mid + 1;
                    mid = (left+right)/2;
                }
            }
        }
        return false;

        // Runtime = 0ms, beats 100% of users
        // Memory = 41.85MB, beats 70.37% of users
    }
}
