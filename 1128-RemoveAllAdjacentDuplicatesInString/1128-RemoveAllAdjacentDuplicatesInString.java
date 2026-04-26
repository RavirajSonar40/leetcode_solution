// Last updated: 27/04/2026, 04:05:28
class Solution {

    static{
        for(int i = 0; i < 500; i++){
            removeDuplicates("");
        }
    }
    static public String removeDuplicates(String s) {
StringBuilder stack = new StringBuilder();

        for (char c : s.toCharArray()) {
            int len = stack.length();

            if (len > 0 && stack.charAt(len - 1) == c) {
                stack.deleteCharAt(len - 1); // pop
            } else {
                stack.append(c); // push
            }
        }

        return stack.toString();
}
}