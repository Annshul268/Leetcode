class MinStack {
    Stack<Integer> st;
    Stack<Integer> min;
    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int value) {
        if(st.isEmpty()){
            st.push(value);
            min.push(value);
            return;
        }

        st.push(value);
        int minimum = Math.min(value, min.peek());
        min.push(minimum);
    }
    
    public void pop() {
        st.pop();
        min.pop();
        return;
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */