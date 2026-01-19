package ICP_REVISION_PHASE_4.Week_2.Sheet_1;

import java.util.*;
public class Valid_Parenthesis_String {
    public static void main(String[] args) {
        String s="((((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())";
        System.out.println(isvalid(s));
    }
    public static boolean isvalid(String s){
        //using stack
        Stack<Integer> open = new Stack<>();
        Stack<Integer> star= new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                open.push(i);
            }
            else if(ch=='*'){
                star.push(i);
            }
            else{
                if(!open.isEmpty()){
                    open.pop();
                }
                else if(!star.isEmpty()){
                    star.pop();
                }
                else{
                    return false;
                }
            }
        }
        while(!open.isEmpty() && !star.isEmpty()){
            if(open.pop()>star.pop()){
                return false;
            }
        }
        return open.isEmpty();
    }
}
