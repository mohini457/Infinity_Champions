package Assignments.Assignment_8;

import java.util.ArrayDeque;
import java.util.Deque;

public class Online_Stock_Span {
    
    private Deque<int[]> stack;
    
    public  StockSpanner() {
        stack = new ArrayDeque<>();
    }
    
    public static  int next(int price) {
        int span = 1;
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }
        
        stack.push(new int[]{price, span});
        return span;
    }
}
