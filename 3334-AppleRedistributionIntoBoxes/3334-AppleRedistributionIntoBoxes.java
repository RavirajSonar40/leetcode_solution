// Last updated: 27/04/2026, 04:05:03
class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
      int c;
        for(int i=0;i<capacity.length;i++){
            for(int j=0;j<capacity.length-i-1;j++){
                if(capacity[j]>capacity[j+1]){
                    c=capacity[j];
                    capacity[j]=capacity[j+1];
                    capacity[j+1]=c;

                }
            }
        }

        int sum = 0;
        int count = 0;

        for (int i = 0; i < apple.length; i++) {
            sum += apple[i];
        }

        for (int i = capacity.length - 1; i >= 0; i--) {
            sum -= capacity[i];
            count++;

            if (sum <= 0) {
                return count;
            }
        }

        return count;
    }
}