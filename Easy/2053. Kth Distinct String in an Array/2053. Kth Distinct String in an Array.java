// 080224 Submission
class Solution {
    public String kthDistinct(String[] arr, int k) {
        
        // Approach
        // 1) Loop through arr and create a HashMap to store unique values of each iteration in arr
        // 2) For each repeat, add 1 to its value
        // 3) Loop through arr again and check if iteration's value in Hashmap is equal to 1 and that k == 1, then return the iteration. Other wise, k -= 1
        // 4) Return empty string ""

        HashMap<String,Integer> hashMap = new HashMap<String,Integer>();

        for (String s : arr) {
            if (hashMap.containsKey(s)) {
                hashMap.put(s,hashMap.get(s)+1);
            }
            else {
                hashMap.put(s,1);
            }
        }

        for (String i : arr) {
            if(hashMap.get(i)==1) {
                k -= 1;
                if (k == 0){
                    return i;
                }
            }
        }
        return "";

        // Testcases
        // 1) arr = ["d","b","c","b","c","a"], k = 2 -> Returns "a"

        // Runtime = 6ms, beats 85.25% of users
        // Memory = 44.14MB, beats 51.35% of users

    }
}
