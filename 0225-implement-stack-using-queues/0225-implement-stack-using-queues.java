import java.util.*;

class MyStack {

    Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.offer(x);
        int size = q.size();
        // rotate elements except the new one
        for (int i = 0; i < size - 1; i++) {
            q.offer(q.poll());
        }
    }

    public int pop() {
        return q.poll();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) {

        MyStack st = new MyStack();

        st.push(5);
        st.push(9);
        st.push(3);
        st.push(10);

        System.out.println("Top: " + st.top()); // should be 10
        System.out.println("Pop: " + st.pop()); // removes 10

        System.out.println("Top now: " + st.top()); // should be 3
        System.out.println("Is empty? " + st.empty());

        st.pop(); // removes 3
        st.pop(); // removes 9
        st.pop(); // removes 5

        System.out.println("Is empty after full pop? " + st.empty());
    }
}
