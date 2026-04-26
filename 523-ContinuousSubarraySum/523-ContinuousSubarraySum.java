// Last updated: 27/04/2026, 04:05:46
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
      HashMap<Integer,Integer> map=new HashMap<>();
        int prefixsum=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            prefixsum+=nums[i];
            if(map.containsKey(prefixsum%k)){
                if(i-map.get(prefixsum%k)>1){
                    return true;
                }
            }else{
                map.put(prefixsum%k,i);
            }
        }
        return false;
    }
}