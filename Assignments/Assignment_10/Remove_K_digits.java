package Assignments.Assignment_10;

import java.util.Stack;

public class Remove_K_digits {
    public static void main(String[] args) {
        String s="1432219";
        int k=3;
        System.out.print(removeKdigits(s, k));
        
    }
     public static String removeKdigits(String num, int k) {

        Stack<Character> stack=new Stack<>();

        for(char item: num.toCharArray()){

            while(!stack.isEmpty() && k>0 && stack.peek()>item){
                stack.pop();
                k--;
            }
            stack.push(item);
        }

        while(k>0 && !stack.isEmpty()){
            stack.pop();
            k--;
        }

        StringBuilder sb=new StringBuilder();
        for(char c: stack){
            sb.append(c);
        }

        while(sb.length() >1 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }

        return (sb.length()==0) ? "0" : sb.toString();
    }
}
