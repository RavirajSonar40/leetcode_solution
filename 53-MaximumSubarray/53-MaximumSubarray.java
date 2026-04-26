// Last updated: 27/04/2026, 04:06:26
class Solution {
    public int maxSubArray(int[] nums) {
         if(nums.length==1){
            return nums[0];
        }

        if(iswholenegative(nums)){
            int max=nums[0];
            for(int i=1;i<nums.length;i++){
                max=Math.max(max, nums[i]);
            }
            return max;
        }

        int max=0;
        int prefix=0;
        for(int n: nums){
            prefix+=n;
            max=Math.max(max,prefix);
            if(prefix<0){
                prefix=0;
            }
        }
        return max;
    }

    static public boolean iswholenegative(int[] nums){
        for(int n:nums){
            if(n>=0){
                return false;
            }
        }
        return true;
    }
}