package Assignments.Assignment_4;

import java.util.HashMap;

public class Permutation_In_String {
    public static void main(String[] args) {
        String s1="ab";
        String s2="eidbaooo";
        System.out.print(checkInclusion(s1, s2));
        
    }
    public static boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        int left=0,right=0,count=s1.length();
        while(right<s2.length()){
            char ch=s2.charAt(right);
            if(map.containsKey(ch)){
                if(map.get(ch)>0){
                    count--;
                }
                map.put(ch, map.get(ch)-1);
            }
            right++;
            if(right-left==s1.length()){
                if(count==0) return true;
                char c=s2.charAt(left);
                if(map.containsKey(c)){
                    if(map.get(c)>=0){
                        count++;
                    }
                    map.put(c, map.get(c)+1);
                }
                left++;
            }
        }
        return false;
    }
}
