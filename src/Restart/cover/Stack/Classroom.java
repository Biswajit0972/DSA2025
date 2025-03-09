package Restart.cover.Stack;

import java.util.ArrayList;

public class Classroom {
    static class myStack {
        ArrayList<Integer> HashedList;
        public  myStack () {
            HashedList = new ArrayList<>();
        }
        public void push (int val) {
            HashedList.add(val);
        }

        public int pop () {
            int size = HashedList.size();
            return HashedList.remove(size-1);
        }

        public int peek() {
            int size = HashedList.size();
            return HashedList.get(size-1);
        }
    }
    public static void main(String[] args) {
        myStack stack =  new myStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek()); // 3
        System.out.println(stack.pop()); // 3
        System.out.println(stack.pop()); // 2
    }
}
