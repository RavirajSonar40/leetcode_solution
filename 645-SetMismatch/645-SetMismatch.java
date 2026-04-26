// Last updated: 27/04/2026, 04:05:43
class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];

        for (int num : nums) {
            int idx = Math.abs(num) - 1;
            if (nums[idx] < 0) {
                ans[0] = Math.abs(num); // duplicate
            } else {
                nums[idx] = -nums[idx];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans[1] = i + 1; // missing
            }
        }

        return ans;
    }
}
