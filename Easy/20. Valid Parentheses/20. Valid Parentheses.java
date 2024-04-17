// 180424 Submission

class Solution {
    public boolean isValid(String s) {
        
        // Approach
        // 1) Create a stack
        // 2) Loop through string and check the type of parenthesis for each iteration
        // 3) If an open parenthesis is the iteration, add the closed parenthesis into the stack
        // 4) If a close parenthesis is the iteration and the stack is empty or the latest iteration in the stack does not match the iteration, return false
        // 5) Else return true

        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();

        // Runtime = 1ms, beats 98.59% of users
        // Memory = 41.65MB, beats 18.91% of users
    }
}
