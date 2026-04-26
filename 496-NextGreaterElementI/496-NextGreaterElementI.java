// Last updated: 27/04/2026, 04:05:47
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int ans[] = new int[n];

        for(int i = 0; i < n; i++){
            int x = nums1[i];
            int j = 0;

            while(nums2[j] != x){
                j++;
            }
            int nge = -1;
            for(int k = j+1; k < nums2.length;k++){
                if(x < nums2[k]){
                    nge = nums2[k];
                    break;
                }
            }
            ans[i] = nge;
        }
        return ans;

    }
}