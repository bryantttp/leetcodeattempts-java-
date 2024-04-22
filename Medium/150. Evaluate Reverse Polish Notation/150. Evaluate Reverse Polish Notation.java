// 220424 Submission

class Solution {
    public int evalRPN(String[] tokens) {
        
        // Approach
        // 1) Create a stack to store all numerical values
        // 2) Loop through string array, if it is a number, add to stack. If it is not a number, run the operation with the 2nd popped number with the first popped value and add it to the stack
        // 3) Return the pop of the stack which should leave the final operated number

        Stack<Integer> answer = new Stack<>();
        for (String s: tokens){
            if (s.equals("+")){
                int tempVal = answer.pop();
                int newVal = answer.pop() + tempVal;
                answer.push(newVal);
            }
            else if (s.equals("-")){
                int tempVal = answer.pop();
                int newVal = answer.pop() - tempVal;
                answer.push(newVal);
            }
            else if (s.equals("*")){
                int tempVal = answer.pop();
                int newVal = answer.pop() * tempVal;
                answer.push(newVal);
            }
            else if (s.equals("/")){
                int tempVal = answer.pop();
                int newVal = answer.pop() / tempVal;
                answer.push(newVal);
            }
            else {
                answer.push(Integer.parseInt(s));
            }
        }
        return answer.pop();
        
        // Runtime = 5ms, beats 96.97% of users
        // Memory = 44.32MB, beats 74.21% of users
    }
}
