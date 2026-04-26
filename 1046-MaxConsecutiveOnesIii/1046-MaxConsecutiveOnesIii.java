// Last updated: 27/04/2026, 04:05:29
class Solution {
    static{
        for(int i=0;i<500;i++){
            int nums1[]={1,1,0,0,1};
            longestOnes(nums1,2);
        }
    }
    public static int longestOnes(int[] nums, int k) {
        int left = 0, zeros = 0, maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) zeros++;

            if (zeros > k) {
                if (nums[left] == 0) zeros--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}