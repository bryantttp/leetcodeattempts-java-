// 300424 Submission
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // Approach
        // 1) Instantiate two integer arrays to record index of temperature and answer for each index
        // 2) Instantiate integer to loop through index int array
        // 3) Loop through temperatures array
        // 4) While loop to check if integer is more than its initial value of -1 and that temperature[i] > temperature[index from index array] based on integer value
        // 5) If so, store the index as an integer and set value of index in answer array to be i - the index
        // 6) for each iteration in for loop, add 1 to integer and set the value of integer index in index array as i

        int[] index = new int[temperatures.length];
        int[] answer = new int[temperatures.length];
        int checker = -1;
        for (int i = 0; i < temperatures.length; i++){
            while (checker > -1 && temperatures[i] > temperatures[index[checker]]){
                int tempValue = index[checker];
                checker--;
                answer[tempValue] = i - tempValue;
            }
            checker++;
            index[checker] = i;
        }
        return answer;
    }

    // Runtime = 8ms, beats 95.68% of users
    // Memory = 60.51MB, beats 51.44% of users
}
