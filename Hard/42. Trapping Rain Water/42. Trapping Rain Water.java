//140524 Submission

class Solution {
    public int trap(int[] height) {
        // Approach
        // 1) Instantiate two pointers, one starting at 1 and the other starting at height.length -2, since the ends of the array cannot store rainwater
        // 2) Instantiate 3 int values that stores the max value of the left/right heights and the answer
        // 3) while loop and increase/decrease left/right pointers depending on which max height was lower
        // 4) at each iteration of the loop, take the min of the max left/right value and minus the height of the current iteration, add that value to answer to simulate the blocks of rainwater being caught
        // 5) return answer

        int frontPointer = 1;
        int backPointer = height.length - 2;
        int maxLeft = height[0];
        int maxRight = height[height.length-1];
        int answer = 0;
        while (frontPointer-1 < backPointer){ // minus 1 here is to ensure that the very last iteration where the frontPointer is less than backPointer is processed and added to the final value
            if (maxLeft < maxRight){
                if (maxLeft < height[frontPointer]){
                    maxLeft = height[frontPointer];
                }
                int tempAnswer = maxLeft - height[frontPointer];
                if (tempAnswer > 0) {
                    answer += tempAnswer;
                }
                tempAnswer = 0;
                frontPointer += 1;
            }
            else{
                if (maxRight < height[backPointer]){
                    maxRight = height[backPointer];
                }
                int tempAnswer = maxRight - height[backPointer];
                if (tempAnswer > 0) {
                    answer += tempAnswer;
                }
                tempAnswer = 0;
                backPointer -= 1;
            }
        }
        return answer;

        // Runtime = 1ms, beats 71.09ms
        // Memory = 46.49MB, beats 20.400% of users
    }
}
