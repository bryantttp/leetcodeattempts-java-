// 200424 Submission

class MinStack {
    /**
    Stores minimum attribute
     */
    int min;

    /**
    Stack that stores the mininum stack of data
     */
    Stack<Integer> stack = new Stack<>();

    /**
    Default constructor
     */
    public MinStack() 
    }
    
    /**
    Method checks if the MinStack is empty and assigns the min value accordingly.
    Checks are done subsequently to ensure that the pop method synchronizes with push method
     */
    public void push(int val) {
        if(stack.empty()){
            min = val;
            stack.push(min);
            stack.push(val);
        }
        else if (val <= min){
            stack.push(min);
            min = val;
            stack.push(val);
        }
        else{
            stack.push(val);
        }
        
    }
    
    /**
    Method checks if the current stack is the minimum and if so, swaps the minimum with the previous pushed value in MinStack
     */
    public void pop() {
        if (stack.pop() == min){
            min = stack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

 // Runtime = 4ms, beats 96.14% of users
 // Memory = 44.21MB, beats 96.30% of users
