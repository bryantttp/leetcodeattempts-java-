class Solution {
    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }
        int[] lessFromLeft = new int[heights.length]; // Records how far the rectangle can stretch to the left, based on the current iteration's height
        int[] lessFromRight = new int[heights.length]; // Records how far the rectangle can stretch to the right, based on the current iteration's height
        lessFromRight[heights.length - 1] = heights.length; // Instantiate the value for the right most height to be of the length of the array since it will be at the end of the array
        lessFromLeft[0] = -1; // Instantiate the value for the left most height to be -1 since it will be at the start of the array
 
        for (int i = 1; i < heights.length; i++) {
            int p = i - 1;

            while (p >= 0 && heights[p] >= heights[i]) {
                p = lessFromLeft[p]; // If the previous height is larger than the current height, this helps to quickly point to the left most index where the rectangle could stretch to, based on p's height
            }
            lessFromLeft[i] = p; // If the previous height is smaller than the current height, that would be the left most index that the rectangle could stretch to, with regards to p.
        }

        for (int i = heights.length - 2; i >= 0; i--) {
            int p = i + 1;

            while (p < heights.length && heights[p] >= heights[i]) {
                p = lessFromRight[p]; // If the current height is smaller than the next height, this helps to quickly point to the right most index where the rectangle could stretch to, based on p's height
            }
            lessFromRight[i] = p; // If the current height is larger than the next height, that would be the right most index that the rectangle could stretch to, with regards to p.
        }

        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            maxArea = Math.max(maxArea, heights[i] * (lessFromRight[i] - lessFromLeft[i] - 1)); // Loops through the height array to check for max area based on the left/right most index each height can reach
            maxArea = Math.max(maxArea, heights[i]); // Checks if the singular rectangle is a larger area than the max possible areas formed from the left/right most indexes per height
        }
        return maxArea;

        // Runtime = 9ms, beats 93.64% of users
        // Memory = 56.37MB, beats 91.81% of users
    }
}
