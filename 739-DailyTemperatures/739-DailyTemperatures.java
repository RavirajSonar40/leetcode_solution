// Last updated: 27/04/2026, 04:05:37
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] warm = new int[temperatures.length];
        Arrays.fill(warm, 0);
        for (int i = temperatures.length - 2; i >= 0; i--) {
            if (temperatures[i] < temperatures[i + 1]) {
                warm[i] = 1;
            } else {
                int k = i + 1;
                while (temperatures[i] >= temperatures[k] && warm[k] != 0) {
                    k = k + warm[k];
                }
                if (warm[k] != 0 || temperatures[k] > temperatures[i])
                    warm[i] = k - i;
            }
        }
        return warm;
    }
}