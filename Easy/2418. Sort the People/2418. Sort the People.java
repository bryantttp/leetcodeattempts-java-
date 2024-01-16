// 160124

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

        // Approach
        // 1) Create a hashmap to store the height and names 
        // 2) Loop through heights.length and add each iteration of heights and names into hashmap
        // 3) use .sort to sort height in ascending order
        // 4) Loop through heights in reverse and add the value (based on [height] key) into a string using stringbuilder
        // 5) Add each string to array list
        // 6) Return arraylist

        HashMap<Integer, String> Namelist = new HashMap<>();

        for (int i = 0; i < heights.length; i++) {
            Namelist.put(heights[i], names[i]);
        }

        Arrays.sort(heights);

        String [] answer = new String[names.length];
        int index = 0;
        for (int i = heights.length - 1; i >= 0; i--) {
            StringBuilder temp_string = new StringBuilder();
            temp_string.append(Namelist.get(heights[i]));
            answer[index] = temp_string.toString();
            index++;
        }
       
        return answer;

        // Test cases
        // 1) names = ["Mary","John","Emma"], heights = [180,165,170] -> Return ["Mary", "Emma", "John"]
        
    }
}
