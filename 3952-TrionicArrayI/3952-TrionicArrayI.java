// Last updated: 27/04/2026, 04:04:56
class Solution {
    public boolean isTrionic(int[] nums) {
        int count=0;
        int index=0;

        if(nums[0]>nums[1]){
            return false;
        }

         for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return false;
            }
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                count++;
                index=i;
                break; 
            }
        }

        for( int i=index;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                count++;
                index=i;
                break;
            }
        }

       if(count==2){
        for(int i=index;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
       }

        if(count==2){
            return true;
        }
        return false;
    }
}