import java.util.Stack;

public class MinStack {

    static class Solution{
        Stack<Integer> st = new Stack<>();
        Stack<Integer> minStack = new Stack<>();

        public void push(int x) {
            st.push(x);
            if (minStack.isEmpty()){
                minStack.push(x);
            }
            else if (minStack.peek() > st.peek()){
                minStack.push(x);
            }
        }
    
        public void pop() {
            if (st.isEmpty()){
                return;
            }
            else if (st.peek() == minStack.peek()){
                st.pop();
                minStack.pop();
            }
            else{
                st.pop();
            }
        }
    
        public int top() {
            if (st.isEmpty()){
                return -1;
            }
            else{
                return st.peek();
            }
        }
    
        public int getMin() {
            if (minStack.isEmpty()){
                return -1;
            }
            else{
                return minStack.peek();
            }
        }
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        s.push(1);
        s.push(2);
        s.push(-2);
        System.out.println(s.getMin());
        s.pop();
        System.out.println(s.getMin());
        System.out.println(s.top());
    }

    
}
