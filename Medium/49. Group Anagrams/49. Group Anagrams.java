// 060624 Submission
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Approach
        // 1) Create a dictionary to store the sorted string as the key and the original string as the value
        // 2) Loop through all keys and store each value in the list and return as answer

        Map<String,List<String>> dict = new HashMap<>();
        for (String s : strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            if (dict.get(sortedString) == null){
                List<String> listOfStrings = new ArrayList<>();
                listOfStrings.add(s);
                dict.put(sortedString,listOfStrings);
            }
            else{
                List<String> existingList = dict.get(sortedString);
                existingList.add(s);
                dict.put(sortedString,existingList);
            }
        }
        List<List<String>> answer = new ArrayList<>();
        for (List<String> str : dict.values()){
            answer.add(str);
        }
        return answer;

        // Runtime = 7ms, beats 67.04% of users
        // Memory = 47.50MB, beats 83.71% of users
    }
}
