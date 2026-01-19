package ICP_REVISION_PHASE_4.Week_2.Stack_basic;

import java.util.*;

// Stack implementation using array..

public class Stack_Implementation {
    
    static int top = -1;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int stack[]=new int[n];
        push(stack, 10);
        push(stack, 20);
        push(stack,30);
        System.out.println(pop(stack)); // pop the top elements
        System.out.println(peek(stack)); // peek the top element

        display(stack); // display the stack elements
    }
    
    // display stack elements
    public static void display(int stack[]){ 
        for(int i=top;i>=0;i--){
            System.out.println(stack[i]);
        }
    }

    // push operation
    public static void push(int stack[],int value){
        if(top==stack.length-1){
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top]=value;
    }

    // pop operation
    public static int pop(int stack[]){
        if(top==-1){
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    // peek operation
    public static int peek(int stack[]){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

}
