// Last updated: 27/04/2026, 04:05:11
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
       long max = 0, currsum = 0;

        // adjust size if needed based on constraints
        int[] freq = new int[100001]; 
        int distinct = 0;

        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            // add right
            currsum += nums[right];
            if (freq[nums[right]] == 0) distinct++;
            freq[nums[right]]++;

            // maintain window size
            if (right - left + 1 > k) {
                currsum -= nums[left];
                freq[nums[left]]--;
                if (freq[nums[left]] == 0) distinct--;
                left++;
            }

            // check valid window
            if (right - left + 1 == k && distinct == k) {
                max = Math.max(max, currsum);
            }
        }

        return max;
    }
}