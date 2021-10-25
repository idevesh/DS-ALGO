// Java Code to find out minimum element in the stack
// https://leetcode.com/problems/min-stack

class MinStack {
    int top;
    int[] stack;
    public MinStack() {
        top = -1;
        stack = new int[30000];
    }
    
    public void push(int val) {
        stack[++top] = val;
        System.out.println("push " + top +", " + val);
    }
    
    public void pop() {
        if(top != -1)
            top = top - 1;
        System.out.println("pop" + top);
    }
    
    public int top() {
        System.out.println(top);
        return stack[top];
    }
    
    public int getMin() {
        return findMin(stack, top+1);
    }
    
    public int findMin(int A[], int n)
    {
      if(n == 1)
        return A[0];
        return Math.min(A[n-1], findMin(A, n-1));
    }
}
