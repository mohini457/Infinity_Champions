package ICP_REVISION_PHASE_4.Week_2.Sheet_1;

import java.util.Stack;

public class Reverse_Using_Stack {
    public static void main(String[] args) {
        String str="GeeksforGeeks";
        System.out.println(reverse(str));
    }

    public static String reverse(String S){
        Stack<Character> stack=new Stack<>();
        for(char ch:S.toCharArray()){
            stack.push(ch);
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
