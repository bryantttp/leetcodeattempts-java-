// 160424 Submission

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            numbers.add(nums[i]);
        }
        int answer = 0;
        for (int j : numbers){
            int tempAnswer = 0;
            if (!numbers.contains(j-1)){
                while (numbers.contains(j)){
                    j++;
                    tempAnswer++;
                }
            }
            if (tempAnswer > answer){
                answer = tempAnswer;
            }
        }
        return answer;

        // Runtime = 29ms, beats 61.61% of users
        // Memory = 67.14MB, beats 22.60% of users
    }
}
