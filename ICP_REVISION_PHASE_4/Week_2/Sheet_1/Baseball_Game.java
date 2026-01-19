package ICP_REVISION_PHASE_4.Week_2.Sheet_1;

import java.util.*;

public class Baseball_Game {
    public static void main(String[] args) {
        String[] ops={"5","-2","4","C","D","9","+","+"};
        System.out.println(Points(ops));
    }
    public static int Points(String s[]){
        Stack<Integer> stack=new Stack<>();
        for(String str:s) {
            switch(str){
                case "C":
                    stack.pop();
                    break;
                case "D":
                    stack.push(2*stack.peek());
                    break;
                case "+":
                    int top=stack.pop();
                    int newtop=top+stack.peek();
                    stack.push(top);
                    stack.push(newtop);
                    break;
                default:
                    stack.push(Integer.valueOf(str));
                    break;
            }
        }
        int sum=0;
        for(int i:stack){
            sum+=i;
        }
        return sum;  
    }
}
