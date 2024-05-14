// 140524 Submission

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Approach
        // 1) Sort the list
        // 2) For loop through the list
        // 3) Within for loop, do a while loop using 2 pointers, where the pointers are not equal
        // 4) Check the three sum. If > 0, shift right pointer backward, if < 0, shift left pointer forward.
        // 5) If = 0, save that value in a list, shift left and right pointers, while left/right equal to its next pointer, += 1 or -= 1 depending on the pointer
        // 6) Return the list as an answer

        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++){
            if (i != 0 && nums[i] == nums[i-1]){
                continue;
            }
            int frontPointer = i+1;
            int backPointer = nums.length-1;
            while (frontPointer < backPointer){
                int threeSum = nums[i] + nums[frontPointer] + nums[backPointer];
                if (threeSum == 0){
                    List<Integer> tempAnswer = new ArrayList<>();
                    tempAnswer.add(nums[i]);
                    tempAnswer.add(nums[frontPointer]);
                    tempAnswer.add(nums[backPointer]);
                    answer.add(tempAnswer);
                    while(frontPointer < backPointer && nums[frontPointer] == nums[frontPointer+1]){
                        frontPointer += 1;
                    }
                    while (frontPointer < backPointer && nums[backPointer] == nums[backPointer-1]){
                        backPointer -= 1;
                    }
                    frontPointer += 1;
                    backPointer -= 1;   
                }
                else if (threeSum > 0){
                    backPointer -= 1;
                }
                else {
                    frontPointer += 1;
                }
            }
        }
        return answer;
    }
}
