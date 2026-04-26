// Last updated: 27/04/2026, 04:04:54
class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] fish=new int[friends.length];
        int k=0;
        for(int i=0;i<order.length;i++){
            for(int j=0;j<friends.length;j++){
                if(order[i]==friends[j]){
                    fish[k++]=order[i];
                    break;
                }
            }
        }
        return fish;
    }
}