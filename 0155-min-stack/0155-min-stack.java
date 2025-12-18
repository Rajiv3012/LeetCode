class MinStack {

        private Stack<Long> st;
        private long min;
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        long x = val;
        if(st.isEmpty()){
            min=x;
            st.push(x);
        }else if(x>=min){
            st.push(x);
        }
        else{
            st.push(2*x-min);
            min=x;
        }
    }
    
    public void pop() {
        if(st.isEmpty())return;
        long x = st.pop();
        if(x<min){
            min=2*min - x;
        }

    }
    
    public int top() {
        long x = st.peek();
        if(x<min){
            return (int)min;
        }
        return (int)x;
    }
    
    public int getMin() {
        return (int)min;
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