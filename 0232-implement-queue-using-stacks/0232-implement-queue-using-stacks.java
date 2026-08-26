// Insertion Efficient
class MyQueue {

    Stack<Integer> st; 
    Stack<Integer> helper;

    public MyQueue() {
        st = new Stack<>();
        helper = new Stack<>();
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        if(st.size() == 1) return st.pop();

        while(!st.isEmpty()){
            helper.push(st.pop());
        }

        // element of queue which to pop is now at top of stack
        int popped = helper.pop();

        while(!helper.isEmpty()){
            st.push(helper.pop());
        }

        return popped;
    }
    
    public int peek() {
        if(st.size() == 1) return st.peek();

        while(!st.isEmpty()){
            helper.push(st.pop());
        }

        int peeked = helper.peek();

        while(!helper.isEmpty()){
            st.push(helper.pop());
        }

        return peeked;
    }
    
    public boolean empty() {
        return st.isEmpty();
    }
}

// Remove Efficient --> removal happen in O(1)
// class MyQueue {
//     Stack<Integer> st; 
//     Stack<Integer> helper;
//     private int size = 0;
//     public MyQueue() {
//         st = new Stack<>();
//         helper = new Stack<>();
//     }
    
//     public void push(int x) {
//         size++;
//         if(st.isEmpty()){
//             st.push(x);
//             return;
//         }

//         while(!st.isEmpty()){
//             int curr = st.pop();
//             helper.push(curr);
//         }

//         helper.push(x);

//         while(!helper.isEmpty()){
//             int curr = helper.pop();
//             st.push(curr);
//         }
//     }
    
//     public int pop() {
//         // size--;
//         return st.pop();
//     }
    
//     public int peek() {
//         return st.peek();
//     }
    
//     public boolean empty() {
//         return st.isEmpty();
//     }
// }



/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */