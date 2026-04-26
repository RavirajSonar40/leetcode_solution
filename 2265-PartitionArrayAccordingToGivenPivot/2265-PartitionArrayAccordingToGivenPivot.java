// Last updated: 27/04/2026, 04:05:15
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans = new int[nums.length];
        int in=0;

        
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                ans[in++]=nums[i];
            }
        }
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot){
                ans[in++]=nums[i];
            }
        }

       
        for(int i=0;i<nums.length;i++){
            if(nums[i]>pivot){
                ans[in++]=nums[i];
            }
        }

        return ans;
    }
}