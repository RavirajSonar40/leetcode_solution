// Last updated: 27/04/2026, 04:05:23
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
       
       for(int i=0;i<nums.length-n;i++){
           ans[i*2]=nums[i];
           ans[i*2+1]=nums[i+n];
       }

       return ans;
    }
}
