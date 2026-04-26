// Last updated: 27/04/2026, 04:05:44
class Solution {
    public double findMaxAverage(int[] nums, int k) {

        long maxaverage;
        long tempmax = 0;

       
        for (int i = 0; i < k; i++) {
            tempmax += nums[i];
        }

        maxaverage = tempmax;

       
        for (int i = k; i < nums.length; i++) {
            tempmax += nums[i];       
            tempmax -= nums[i - k];    

            if (maxaverage < tempmax) {
                maxaverage = tempmax;
            }
        }

        return (double) maxaverage / k;
    }
}
