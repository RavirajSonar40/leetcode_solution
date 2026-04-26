// Last updated: 27/04/2026, 04:06:32
class Solution {
    public int strStr(String haystack, String needle) {
 int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {

            if (haystack.charAt(i) == needle.charAt(0)) {
                int j;

                for (j = 0; j < m; j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        break;
                    }
                }

                if (j == m) {
                    return i;
                }
            }
        }

        return -1; 
    }
}