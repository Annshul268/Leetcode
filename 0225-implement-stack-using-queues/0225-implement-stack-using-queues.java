class MyStack {
    Queue<Integer> q;
    Queue<Integer> helper;
    public MyStack() {
        q = new LinkedList<>();
        helper = new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        if(q.size() == 1) return q.poll();

        while(q.size() > 1){
            helper.add(q.poll());
        }

        int poll = q.poll();

        while(!helper.isEmpty()){
            q.add(helper.poll());
        }

        return poll;
    }
    
    public int top() {
        if(q.size() == 1) return q.peek();

        while(q.size() > 1){
            helper.add(q.poll());
        }

        int peeked = q.poll();

        while(!helper.isEmpty()){
            q.add(helper.poll());
        }
        q.add(peeked);

        return peeked;
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */