// Last updated: 27/04/2026, 04:05:09
class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
       Arrays.sort(score,(a,b)->b[k]-a[k]);
        return score;
    }
}