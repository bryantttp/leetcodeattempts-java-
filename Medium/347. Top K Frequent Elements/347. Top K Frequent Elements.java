// 090324 Submission
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       
        // Approach
        // 1) Instantiate answer array based on k
        // 2) Instantiate a counter to fill the array
        // 3) Instantiate map object to store count of number as key and the number as the value (in an arraylist)
        // 3) while loop to check if k is not equal to 0
        // 4) Within while loop, use collections.max() on the keySet of the map object to find the number with the highest occurance
        // 5) Get its value and add it to the answer array's index based on the counter, counter += 1
        // 6) Remove the key from the map object and k -= 1
        // 7) Return answer array
        
        int[] answer = new int[k];
        int counter = 0;
        Map<Integer,Integer> countOfNumbers = new HashMap<Integer,Integer>();
        Map<Integer,ArrayList<Integer>> countOfNumbersInverted = new HashMap<Integer,ArrayList<Integer>>();

        for (int i = 0; i < nums.length; i++){
            if (countOfNumbers.containsKey(nums[i])){
                countOfNumbers.put(nums[i],countOfNumbers.get(nums[i])+1);
            }
            else {
                countOfNumbers.put(nums[i],1);
            }
        }

        for (Integer j : countOfNumbers.keySet()){
            if (countOfNumbersInverted.containsKey(countOfNumbers.get(j))){
                ArrayList<Integer> tempList2 = countOfNumbersInverted.get(countOfNumbers.get(j));
                tempList2.add(tempList2.size()-1,j);
                countOfNumbersInverted.put(countOfNumbers.get(j), tempList2);
            }
            else {
                ArrayList<Integer> tempList = new ArrayList<>();
                tempList.add(j);
                countOfNumbersInverted.put(countOfNumbers.get(j), tempList);
            }
        }

        while (k != 0) {
            List<Integer> highestCount = countOfNumbersInverted.get(Collections.max(countOfNumbersInverted.keySet()));
            for (Integer l : highestCount){
                answer[counter] = l;
                counter += 1;
                k -= 1;
            }
            countOfNumbersInverted.remove(Collections.max(countOfNumbersInverted.keySet()));
        }

        return answer;


        // Runtime = 15ms, beats 47.19% of users
        // Memory = 48.59MB, beats 49.48% of users
    }
}
