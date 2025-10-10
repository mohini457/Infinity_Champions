package Assignments.Assignment_8;

import java.util.Stack;

public class Evaluate_Reverse_Polish_Notation {
    public static void main(String[] args) {
        String tokens[]={"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.print(evalRPN(tokens));
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String s: tokens){
            switch(s){
                case "+": st.push(st.pop()+st.pop());
                        break;
                case "-": int a=st.pop();
                          int b=st.pop();
                          st.push(b-a);
                        break;
                case "*": st.push(st.pop()*st.pop());
                        break;
                case "/": int m=st.pop();
                          int n=st.pop();
                          st.push(n/m);
                        break;
                default: st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}
