package ICP_REVISION_PHASE_4.Week_2.Sheet_1;

import java.util.*;

public class Valid_Parentheses {
    public static void main(String[] args) {
        String s="({[]})";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s){
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='{'){
                stack.push('}');
            }
            else if(ch=='('){
                stack.push(')');
            }
            else if(ch=='['){
                stack.push(']');
            }
            else if(stack.isEmpty() || stack.pop()!=ch){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
