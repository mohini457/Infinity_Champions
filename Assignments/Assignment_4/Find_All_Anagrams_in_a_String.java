package Assignments.Assignment_4;

import java.util.*;

public class Find_All_Anagrams_in_a_String {
    public static void main(String[] args) {
        String s="cbaebabacd";
        String p="abc";
        List<Integer> ll =FindAnagram(s, p);
        System.out.print(ll);
    }
    public static List<Integer> FindAnagram(String s, String p){
        List<Integer> result=new ArrayList<>();
        if(s.length()<p.length()) return result;
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch: p.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        int left = 0, right = 0;
        int count = p.length();  

        while (right < s.length()) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                if (map.get(c) > 0) {
                    count--;
                }
                map.put(c, map.get(c) - 1);
            }
            right++;

            if (right - left == p.length()) {
                if (count == 0) {
                    result.add(left);
                }

                char leftChar = s.charAt(left);
                if (map.containsKey(leftChar)) {
                    if (map.get(leftChar) >= 0) {
                        count++;
                    }
                    map.put(leftChar, map.get(leftChar) + 1);
                }
                left++;
            }
        }
        return result;
    }
    
}
