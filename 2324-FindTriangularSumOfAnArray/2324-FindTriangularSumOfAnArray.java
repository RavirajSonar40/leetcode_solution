// Last updated: 27/04/2026, 04:05:14
class Solution {
    public int triangularSum(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        for (int i = 0 ; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                nums[j] = (nums[j] + nums[j + 1]) % 10;
            }
        }

        return nums[0];
        
    }
}