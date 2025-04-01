package Restart.SDE.Stack;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
       q.add(1);
       q.add(2);
        q.isEmpty();
        
        q.remove(q.size() - 1);
    }
}
