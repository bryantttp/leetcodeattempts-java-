// 140524 Submission

class Solution {
    public int maxArea(int[] height) {
        // Approach
        // 1) Instantiate an int to store the answer
        // 2) Instantiate another int to record the current width of the container
        // 3) Start from both ends of the array (2 pointer) and record the maximum area of water that it can contain
        // 4) Loop through the array and store the max area of container based on the lowest height
        // 5) At each loop, check retain the highest height. Shift the other pointer. If both heights are the same, check the next heights and shift to the higher one
        // 6) Return answer;

        int currentWidth = height.length-1;
        int frontPointer = 0;
        int backPointer = height.length-1;
        int answer = 0;
        
        while (frontPointer < backPointer){
            if (height[frontPointer] > height[backPointer]) {
                answer = Math.max(height[backPointer] * currentWidth,answer);
                backPointer -= 1;
            }
            else if (height[frontPointer] < height[backPointer]){
                answer = Math.max(height[frontPointer] * currentWidth,answer);
                frontPointer += 1;
            }
            else {
                int nextFront = height[frontPointer+1];
                int nextBack = height[backPointer-1];
                if (nextFront > nextBack){
                    answer = Math.max(height[frontPointer] * currentWidth,answer);
                    frontPointer += 1;
                }
                else {
                    answer = Math.max(height[backPointer] * currentWidth,answer);
                    backPointer -= 1;
                }
            }
            currentWidth -= 1;
        }
        return answer;
        // Runtime = 4ms, beats 87.60% of users
        // Memory = 57.88MB, 45.02% of users
    }
}
