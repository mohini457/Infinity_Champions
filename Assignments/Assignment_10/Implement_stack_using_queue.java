package Assignments.Assignment_10;

import java.util.LinkedList;
import java.util.Queue;

public class Implement_stack_using_queue {

    private Queue<Integer> q1;
    private Queue<Integer> q2;


    public Implement_stack_using_queue() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
        
    }
    
    public void push(int x) {
        q2.offer(x);
        while(!q1.isEmpty()){
            q2.offer(q1.poll());
        }
        Queue<Integer> temp=q1;
        q1=q2;
        q2=temp;
    }
    
    public int pop() {
        return q1.poll();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
    
}
