package ICP_REVISION_PHASE_4.Week_2.Sheet_1;

import java.util.*;

public class Remove_Outermost_Parentheses {
    public static void main(String[] args) {
        String s="(()())(())(()(()))";
        // System.out.println(removeouterparentheses(s));
        System.out.println(using_stack(s));
    }
    public static String removeouterparentheses(String s){
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(count>0){
                    sb.append(ch);
                }
                count++;
            }
            else if(ch==')'){
                count--;
                if(count>0){
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
        
    }
    public static String using_stack(String s){
        StringBuilder sb=new StringBuilder();
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(!st.isEmpty()){
                    sb.append(ch);
                }
                st.push(ch);
            }
            else {
                st.pop();
                if(!st.isEmpty()){
                    sb.append(ch);
                }
            }

        }
        return sb.toString();
    }
}
