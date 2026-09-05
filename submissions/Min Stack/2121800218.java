# Title: Min Stack
# Submission ID: 2121800218
# Status: Time Limit Exceeded
# Date: 27 August 2026 at 16:11:25 GMT+5:30

class MinStack {
    int top = -1;
    int[] stack;

    public MinStack() {
        stack = new int[1000000];
    }
    
    public void push(int value) {
        stack[++top] = value;
    }
    
    public void pop() {
        if(top != -1) {
            top = top - 1;
        }
    }
    
    public int top() {
        return stack[top];
    }
    
    public int getMin() {
        return findMinimum(stack, top);
    }

    public int findMinimum(int[] stack, int top) {
        if(top == 0) {
            return stack[0];
        }
        return Math.min(stack[top], findMinimum(stack, top - 1));
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