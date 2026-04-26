// Last updated: 27/04/2026, 04:05:55
class Solution {
    public void reverseString(char[] s) {
    
    
        int l = 0, r = s.length - 1;
        while (l < r) {
            char t = s[l];
            s[l] = s[r];
            s[r] = t;

            l++;
            r--;
        }

      
        
    }
}