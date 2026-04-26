// Last updated: 27/04/2026, 04:06:10
class Solution {
    public int maximumGap(int[] nums) {
        int n=nums.length;
        if(n<2) return 0;
        int max=0;
        for(int num:nums){
            max=Math.max(num,max);
        }
        int width=0;
        while(max!=0){
            max=max/10;
            width++;
        }
        for(int i=1;i<=width;i++){
            countSort(nums,i);
        }
        int maxs=0;
        for(int i=0;i<n-1;i++){
            int diff=nums[i+1]-nums[i];
            maxs=Math.max(maxs,diff);
        }
        return maxs;
    }
    public void countSort(int []nums,int col){
        int []count=new int[10];
        int powValue=(int)Math.pow(10,col-1);
        for(int i=0;i<nums.length;i++){
            int idx=(nums[i]/powValue) % 10;
            count[idx]=count[idx]+1;
        }
        int startIndex=0;
        for(int i=0;i<count.length;i++){
            int curr=count[i];
            count[i]=startIndex;
            startIndex+=curr;
        }
        int []newArray=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int idx= (nums[i]/powValue) % 10;
            newArray[count[idx]]=nums[i];
            count[idx]+=1;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=newArray[i];
        }
    }   
}