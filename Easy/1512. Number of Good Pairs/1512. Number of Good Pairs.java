// 220224 Submission

class Solution {
    public static int goodPairs(int num){
        num = num-1;
        return num*(num+1)/2;
    }

    public int numIdenticalPairs(int[] nums) {

        // Approach
        // 1) Create method to calculate goodpairs per number's occurance
        // 2) Create hashmap to store int as key and occurance as value
        // 3) Loop through all keys and use goodPairs on each value and store it in ans variable
        // 4) Return answer

        Map<Integer,Integer> pairMap = new HashMap<Integer,Integer>();
        for (int i : nums){
            if (pairMap.containsKey(i)){
                pairMap.put(i,pairMap.get(i)+1);
            }
            else {
                pairMap.put(i,1);
            }
        }

        int answer = 0;
        for (int i : pairMap.keySet()){
            answer += goodPairs(pairMap.get(i));
        }
        return answer;

        // Runtime = 1ms, beats 86.34% of users
        // Memory = 40.60MB, beats 90.05% of users;
    }
}
