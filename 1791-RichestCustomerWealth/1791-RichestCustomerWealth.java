// Last updated: 27/04/2026, 04:05:19
class Solution {
    public int maximumWealth(int[][] accounts) {
         int max=0;

        for (int r = 0 ;r <accounts.length ; r++){
            int maxrow=0;
            for (int c = 0; c < accounts[r].length; c++) {
                maxrow=maxrow+accounts[r][c];
            }
            if(maxrow>max){
                max=maxrow;
            }
        }
        return max;
    }
}