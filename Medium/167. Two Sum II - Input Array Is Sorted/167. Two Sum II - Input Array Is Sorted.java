// 050424 Submission

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Approach
        // 1) Instantiate two pointers, one starting from the front and the other from the end
        // 2) Instantiate an int array of length 2 to return answer
        // 3) While loop with a condition that the front pointer is < the end pointer
        // 4) Check the sum of the integers, if it is more than the target, end pointer -= 1
        // 5) If it is less than the target, start pointer += 1
        // 6) If it is equal, ans array first index is front pointer , 2nd index is end pointer, return ans

        int frontPointer = 0;
        int backPointer = numbers.length-1;
        int[] answer = new int[2];

        while (frontPointer < backPointer){
            int firstNumber = numbers[frontPointer];
            int secondNumber = numbers[backPointer];
            if (target > (firstNumber + secondNumber)){
                frontPointer += 1;
            }
            else if (target < (firstNumber + secondNumber)){
                backPointer -= 1;
            }
            else {
                answer[0] = frontPointer+1;
                answer[1] = backPointer+1;
                break;
            }
        }
        return answer;

        // Runtime = 2ms, beats 92.78% of users
        // Memory = 47.20MB, beats 33.12% of users
    }
}
