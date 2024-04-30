// 300424 Submission

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        // Approach
        // 1) Instantiate double array to record time taken to reach target per car, based on their position relative to target (O(n))
        // 2) Sort position integer array (O(nlog(n)))
        // 3) Instantiate answer int to store answer
        // 4) Loop through position integer array. Store the time taken to reach target for each car as a variable
        // 5) Check if the time taken is longer than the longestTimeTaken variable. If so, replace the longestTimeTaken variable with that and add 1 to answer to add a car fleet
        // 6) Return answer

        double[] time = new double[target];
        for(int i = 0; i < position.length; i++){
            time[position[i]] = (double)(target - position[i]) / speed[i];
        }
        int answer = 0;
        double longestTimeTaken = 0;
        Arrays.sort(position); // Sorts cars based on position from target, in ascending order
        for(int i = position.length - 1; i >= 0; i--){
            if(longestTimeTaken < time[i]){ // Checks if subsequent cars would take a longer or shorter time to reach target, compared to the previously longestTimeTaken. If longer, then the car would join the previous car fleet.
                answer++; // Else, it would be faster than the previous car and hence be a car fleet on its own
                longestTimeTaken = time[i];
            }
        }
        return answer;

        // Runtime = 19ms, beats 88.04% of users
        // Memory = 56.68MB, beats 78.10% of users
    }
}
