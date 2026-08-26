class MyQueue {
    Stack<Integer> st; 
    Stack<Integer> helper;
    private int size = 0;
    public MyQueue() {
        st = new Stack<>();
        helper = new Stack<>();
    }
    
    public void push(int x) {
        if(st.isEmpty()){
            size++;
            st.push(x);
            return;
        }

        while(!st.isEmpty()){
            int curr = st.pop();
            helper.push(curr);
        }

        helper.push(x);

        while(!helper.isEmpty()){
            int curr = helper.pop();
            st.push(curr);
        }

        size++;
    }
    
    public int pop() {
        size--;
        return st.pop();
    }
    
    public int peek() {
        return st.peek();
    }
    
    public boolean empty() {
        return st.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */