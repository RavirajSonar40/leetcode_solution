// Last updated: 27/04/2026, 04:05:05
class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        int maxH = longestConsecutiveRun(hBars) + 1;
        int maxV = longestConsecutiveRun(vBars) + 1;

        int side = Math.min(maxH, maxV);
        return side * side;
    }

    public static int longestConsecutiveRun(int[] arr) {
        if (arr.length == 0) return 0;

        Arrays.sort(arr);

        int maxRun = 1;
        int currentRun = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                currentRun++;
                maxRun = Math.max(maxRun, currentRun);
            } else {
                currentRun = 1;
            }
        }

        return maxRun;
    }
}