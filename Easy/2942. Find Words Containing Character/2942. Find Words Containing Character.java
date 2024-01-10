// 100124 Submission
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {

        // Approach
        // 1) Create an dynamic array
        // 2) loop through words. if indexOf x in iteration of words is != -1, add iteration to dynamic array
        // 3) Return dynamic array

        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                answer.add(i);
            }
        }
        return answer;
        
        // Test cases
        // 1) x occurs in words
        //    words = ["leet","code"], x = "e" -> Returns [0,1]
        // 2) x does not occur in words
        //    words = ["abc","bcd","aaaa","cbc"], x = "z" -> Returns []
        

        // Runtime = 1ms, beats 100% of users
        // Memory = 45.03MB, beats 6.26% of users
    }
}
