package Restart.cover.Stack;

import java.util.Stack;

public class pushBottom {
    public static void  pushAtBottom (Stack<Integer> s1, int val) {
        if (s1.isEmpty()) {
            s1.push(val);
            return;
        }

        Stack<Integer> temp = new Stack<>();

        while (!s1.isEmpty()) { // O(n)
            temp.push(s1.pop());
        }

        s1.push(val); // O(1)

        while (!temp.isEmpty()) {
            s1.push(temp.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        st1.push(2);
        st1.push(3);
        st1.push(4);
        pushAtBottom(st1, 1);
        while (!st1.isEmpty()) {
            System.out.println(st1.pop());
        }
    }
}
