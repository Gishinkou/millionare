package hot100.stack;

/**
 * mybatis 155. 最小栈
 */
public class P155_MinStack {

    public static class MinStack {
        public MinStack() {
            // TODO
        }
        public void push(int val) {
            // TODO
        }
        public void pop() {
            // TODO
        }
        public int top() {
            // TODO
            return 0;
        }
        public int getMin() {
            // TODO
            return 0;
        }
    }

    public static void main(String[] args) {
        MinStack s = new MinStack();
        s.push(-2); s.push(0); s.push(-3);
        System.out.println("getMin = " + s.getMin() + " (expect -3)");
        s.pop();
        System.out.println("top = " + s.top() + " (expect 0)");
        System.out.println("getMin = " + s.getMin() + " (expect -2)");
    }
}
