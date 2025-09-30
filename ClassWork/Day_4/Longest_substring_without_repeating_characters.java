import java.util.HashSet;
import java.util.Set;

public class Longest_substring_without_repeating_characters {

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
