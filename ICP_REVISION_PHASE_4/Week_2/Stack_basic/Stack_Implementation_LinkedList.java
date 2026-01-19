package ICP_REVISION_PHASE_4.Week_2.Stack_basic;

public class Stack_Implementation_LinkedList {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static Node top=null;
    public static void main(String[] args) {
        // stack implementation using linked list
        push(10);
        push(20);
        push(30);
        System.out.println(pop());
        System.out.println(peek());

        
    }

    //push operation
    public static void push(int data){
        Node newnode=new Node(data);
        if(top==null){
            top=newnode;
            return;
        }
        newnode.next=top;
        top=newnode;
    }

    //pop operation
    public static int pop(){
        if(top==null){
            System.out.println("Stack Underflow");
            return -1;
        }
        int n=top.data;
        top=top.next;
        return n;
    }

    //peek operation
    public static int peek(){
        if(top==null){
            System.out.println("Stack is Empty");
            return -1;
        }
        return top.data;  
    }
}
