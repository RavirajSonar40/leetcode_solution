// Last updated: 27/04/2026, 04:05:06
import java.util.*;

class Solution {
    public boolean checkStrings(String s1, String s2) {
        HashMap<Character, Integer> evenMap = new HashMap<>();
        HashMap<Character, Integer> oddMap = new HashMap<>();

        int n = s1.length();

        for (int i = 0; i < n; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (i % 2 == 0) {
                evenMap.put(c1, evenMap.getOrDefault(c1, 0) + 1);
                evenMap.put(c2, evenMap.getOrDefault(c2, 0) - 1);
            } else {
                oddMap.put(c1, oddMap.getOrDefault(c1, 0) + 1);
                oddMap.put(c2, oddMap.getOrDefault(c2, 0) - 1);
            }
        }

        for (int val : evenMap.values()) {
            if (val != 0) return false;
        }

        for (int val : oddMap.values()) {
            if (val != 0) return false;
        }

        return true;
    }
}