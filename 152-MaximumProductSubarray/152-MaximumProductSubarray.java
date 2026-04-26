// Last updated: 27/04/2026, 04:06:12
class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int maxProd = nums[0];
        int minProd = nums[0];

        for(int i = 1; i < nums.length; i++) {
            int n = nums[i];

            if(n < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            maxProd = Math.max(n, maxProd * n);
            minProd = Math.min(n, minProd * n);

            max = Math.max(max, maxProd);
        }

        return max;
    }
}