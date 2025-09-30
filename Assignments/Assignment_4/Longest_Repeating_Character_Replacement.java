package Assignments.Assignment_4;

import java.util.HashMap;

public class Longest_Repeating_Character_Replacement {
    public static void main(String[] args) {
       String s="ABAB";
       int k=2;
       System.out.print(characterReplacement(s,k));
    }
    public static int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, maxCount = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);

            
            maxCount = Math.max(maxCount, map.get(c));

            
            while ((right - left + 1) - maxCount > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
