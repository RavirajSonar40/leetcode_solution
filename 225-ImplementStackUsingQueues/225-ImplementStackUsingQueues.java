// Last updated: 27/04/2026, 04:06:04
import java.util.*;

class MyStack {

    Queue<Integer> first;
    Queue<Integer> second;

    public MyStack() {
        first = new LinkedList<>();
        second = new LinkedList<>();
    }
    
    public void push(int x) {
        first.add(x);
    }
    
    public int pop() {
        if (first.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

      
        while (first.size() > 1) {
            second.add(first.remove());
        }

        int removed = first.remove();

     
        while (!second.isEmpty()) {
            first.add(second.remove());
        }

        return removed;
    }
    
    public int top() {
        if (first.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        while (first.size() > 1) {
            second.add(first.remove());
        }

        int peeked = first.peek();
        second.add(first.remove()); 

        while (!second.isEmpty()) {
            first.add(second.remove());
        }

        return peeked;
    }
    
    public boolean empty() {
        return first.isEmpty();
    }
}