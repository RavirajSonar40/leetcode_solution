// Last updated: 27/04/2026, 04:05:53
class Solution {
    public int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > start) {
                start = nums[i];  
            }
            end += nums[i];        
        }

        
        while (start < end) {
            int mid = start + (end - start) / 2;

            
            int sum = 0;
            int pieces = 1;
            for (int i = 0; i < nums.length; i++) {
                if (sum + nums[i] > mid) {
                    sum = nums[i];   
                    pieces++;
                } else {
                    sum += nums[i];  
                }
            }

            if (pieces > m) {
                
                start = mid + 1;
            } else {
                
                end = mid;
            }
        }

        return end; 
    }
}