// Last updated: 27/04/2026, 04:05:01
class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long ans = 0;
        int count = 0;
        Arrays.sort(happiness);
        for(int i = happiness.length-1;i>=0 && k>0;i--){
            int val = happiness[i]-count;
            if(val>0) ans+=val;
            count++;
            k--;
        }
        return ans;
    }
}