// Last updated: 27/04/2026, 04:06:18
class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            char a = s.charAt(left);
            char b = s.charAt(right);

            // If uppercase, convert to lowercase
            if (a >= 'A' && a <= 'Z') a = (char)(a + 32);
            if (b >= 'A' && b <= 'Z') b = (char)(b + 32);

            // Skip non-alphanumeric
            if (!((a >= 'a' && a <= 'z') || (a >= '0' && a <= '9'))) {
                left++;
                continue;
            }
            if (!((b >= 'a' && b <= 'z') || (b >= '0' && b <= '9'))) {
                right--;
                continue;
            }

            // Compare both ends
            if (a != b) return false;

            left++;
            right--;
        }

        return true;
    }
}