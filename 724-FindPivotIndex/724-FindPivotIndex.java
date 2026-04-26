// Last updated: 27/04/2026, 04:05:40
class Solution {
    public int pivotIndex(int[] nums) {
        int globalsum=0;
       for(int i=0;i<nums.length;i++){
        globalsum+=nums[i];
       }

       int prefixsum=0;
       for(int i=0;i<nums.length;i++){
        prefixsum+=nums[i];
        if(prefixsum-nums[i]==globalsum-prefixsum){
            return i;
        }
       }
       return -1;
    }
}