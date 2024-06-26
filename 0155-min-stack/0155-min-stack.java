
class MinStack {
        Stack<Integer> STACK = new Stack<Integer>();
        Stack<Integer> min = new Stack<Integer>();

    public MinStack() {
     
    }
    
    public void push(int val) {
       if(min.isEmpty() ||  val <= min.peek()){
           min.push(val);
       }
       STACK.push(val);
    }
    
    public void pop() {
        if(STACK.peek().equals(min.peek())){
            min.pop();
        }
       STACK.pop();
    }
    
    public int top() {
        return STACK.peek();
    }
    
    public int getMin() {
       
        return min.peek();
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