// 050324 Submission
class Solution {
    public int largestRectangleArea(int[] heights) {
        // Approach
        // 1) Create two stacks that records the index where the rectangle could extend to based on its height and the height
        // 2) Iterate through the list 
        // 3) Create 3 int values, one to record the answer, one to record the last index stack value and a counter that records how far the rectangle could extend horizontally
        // 4) While loop to check if the iterated height is smaller than the peeked height stack value, counter += 1, verify the max area and pop the value from both stacks
        // 5) Then push the current height into height stack and index - counter into the index stack
        // 6) Once iteration is done, while loop to check if the size of height/index stack is equal to zero
        // 7) In the while loop, check the max area and pop from both stacks
        // 8) Return answer

        Stack<Integer> heightStack = new Stack<>();
        Stack<Integer> indexStack = new Stack<>();
        int maxArea = 0;
        int counter1 = 0;
        int counter2 = 0;

        for (int i = 0; i < heights.length; i++){
            if (heightStack.isEmpty()){
                heightStack.push(heights[i]);
                indexStack.push(i);
            }
            else {
                while (!heightStack.isEmpty() && heights[i] < heightStack.peek()) {
                    counter1 = indexStack.peek();
                    counter2 += 1;
                    int tempMaxArea = (i - indexStack.pop())*heightStack.pop();
                    if (tempMaxArea > maxArea){
                        maxArea = tempMaxArea;
                    }
                }
                if (counter1 != 0 || (counter2 != 0 && i != 0)){
                    heightStack.push(heights[i]);
                    indexStack.push(counter1);
                }
                else {
                    heightStack.push(heights[i]);
                    indexStack.push(i - counter2);
                }
                counter1 = 0;
                counter2 = 0;
            }
        }
        while (heightStack.size() != 0) {
            int tempMaxArea = ((heights.length) - indexStack.pop())*heightStack.pop();
            if (tempMaxArea > maxArea){
                maxArea = tempMaxArea;
            }
        }
        return maxArea;

        // Runtime = 79ms, beats 43.05% of users
        // Memory = 56.52MB, beats 88.14% of users
    }
}
