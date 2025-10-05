package ClassWork.Day_7;

import java.util.*;

public class Stop_recursion {
    public static void main(String[] args) {
        List<Integer> ll=new ArrayList<>();
        ll.add(12);
        ll.add(10);
        displayname(ll);
    }
    public static void displayname(List<Integer> s){
        System.out.print(s);
        for(int i=0;i<s.size();i++){
            s.remove(i);
            displayname(s);
        }
    }
}
