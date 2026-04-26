// Last updated: 27/04/2026, 04:06:45
class Solution {
    public int[] twoSum(int[] nums, int target) {
         int sum=0;
        for(int start=0;start<nums.length;start++){
            for(int i=start+1;i<nums.length;i++){
                sum=nums[start]+nums[i];
                if(sum==target){
                    return new int[]{start,i};
                }
            }
        }
        return new int[]{-1,-1};
    }
}