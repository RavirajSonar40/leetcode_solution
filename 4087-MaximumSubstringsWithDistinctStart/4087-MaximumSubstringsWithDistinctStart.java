// Last updated: 27/04/2026, 04:04:55
class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> mySet = new HashSet<Character>();
        int ans = 0;
        for (Character c : s.toCharArray()) {
            if (!mySet.contains(c)) {
                ans++;
                mySet.add(c);
            }
        }

        return ans;
    }
}