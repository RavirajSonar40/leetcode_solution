// Last updated: 27/04/2026, 04:06:17
class Solution {
    public int singleNumber(int[] nums) {
     int ans = nums[0];
        for (int i = 1; i < nums.length; i++) ans ^= nums[i];
        return ans;
    }
}