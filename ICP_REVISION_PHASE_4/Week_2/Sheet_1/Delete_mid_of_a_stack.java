package ICP_REVISION_PHASE_4.Week_2.Sheet_1;

import java.util.Stack;

public class Delete_mid_of_a_stack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        deleteMid(st);

        while (!st.isEmpty()) {
            int p = st.pop();
            System.out.print(p + " ");
        }
    }

    public static void deleteMid(Stack<Integer> s){
        Stack<Integer> temp=new Stack<>();
        int n=s.size();
        for (int i=0;i<n;i++){
            if(i==n/2){
                s.pop();
            }
            else{
                temp.push(s.pop());
            }
        }
        while(!temp.isEmpty()){
            s.push(temp.pop());
        }
    }
    // public static void deleteMid(Stack<Integer> s) {
    //     // code here
    //     int n=s.size();
    //     Stack<Integer> st1=new Stack<>();
    //     int c=0;
    //     while(c<n/2){
    //         int a=s.pop();
    //         st1.push(a);
    //         c++;
    //     }
    //     s.pop();
    //     while(!st1.isEmpty()){
    //         s.push(st1.pop());
    //     }
    // }
}
