package ICP_REVISION_PHASE_4.Week_4;

import java.util.*;

public class Flatten_a_linkedlist {

    public static class Node{
        int data;
        Node next;
        Node child;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            Node head=null;
            HashMap<Integer,Node> map = new HashMap<>();
            HashSet<Integer> children = new HashSet<>();

            for(int i=0;i<N-1;i++){
                int u = sc.nextInt();
                int v = sc.nextInt();
                int type = sc.nextInt();

                map.putIfAbsent(u, new Node(u));
                map.putIfAbsent(v, new Node(v));

                if(type == 1) map.get(u).next = map.get(v);
                else map.get(u).child = map.get(v);

                children.add(v);
           }


          for(int key : map.keySet()){
            if(!children.contains(key)){
                head = map.get(key);
                break;
            }
          }
            flatten(head);
            for (Node curr = head; curr != null; curr = curr.next) {
                System.out.print(curr.data + " ");
            }
            System.out.println();
        }
    }
    public static void flatten(Node head){
        if (head == null) return;

    Stack<Node> st = new Stack<>();
    st.push(head);
        Node prev = null;
       
        while (!st.isEmpty()) {
        Node curr = st.pop();

        if (prev != null) {
            prev.next = curr;
        }

        // Push next first
        if (curr.next != null) {
            st.push(curr.next);
        }

       
        if (curr.child != null) {
            st.push(curr.child);
        }

        curr.child = null; 
        prev = curr;
    
    }
}
