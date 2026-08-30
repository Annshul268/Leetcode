class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int max = 0;

        st.push(0);

        for(int i = 1; i < heights.length; i++){
            while(!st.isEmpty() && heights[i] < heights[st.peek()]){
                max = getmax(heights,st,max,i);
            }
            st.push(i);
        }

        int i = heights.length;

        while(!st.isEmpty()){
            max = getmax(heights,st,max,i);
        }

        return max;
    }

    public int getmax(int []arr, Stack<Integer> st, int max, int i){
        int area;
        int popped = st.pop();

        if(st.isEmpty()){
            area = arr[popped] * i;
        }else{
            area = arr[popped] * (i - 1 - st.peek());
        }

        return Math.max(area,max);
    }
}