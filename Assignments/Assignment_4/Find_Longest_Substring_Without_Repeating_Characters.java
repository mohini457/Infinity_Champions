import java.util.*;

public class Find_Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        String s="bbbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int length=0;
        int m=0;
        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(m));
                m++;
            }
            set.add(s.charAt(i));
            length=Math.max(length,i-m+1);
        }
        return length;
    }
}
