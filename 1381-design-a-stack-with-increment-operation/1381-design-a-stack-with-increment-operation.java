class CustomStack {

    Stack<Integer> st;
    Stack<Integer> helper;
    int maxSize;
    public CustomStack(int maxSize) {
        st = new Stack<>();
        helper = new Stack<>();
        this.maxSize = maxSize;

    }
    
    public void push(int x) {
        if(st.size() < maxSize){
            st.push(x);
        }
    }
    
    public int pop() {
        if(st.isEmpty()){
            return -1;
        }

        return st.pop();
    }
    
    public void increment(int k, int val) {
        if(k >= st.size()){
            while(!st.isEmpty()){
                helper.push(val + st.pop());
            }
        }else{
            // remove size-k element from top in which increment is not happening
            int size = st.size(); 
            for(int i = 0; i < size - k; i++){
                helper.push(st.pop());
            }

            // increment remaining k elements with val
            while(!st.isEmpty()){
                helper.push(val + st.pop());
            }
        }

        while(!helper.isEmpty()){
            st.push(helper.pop());
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */