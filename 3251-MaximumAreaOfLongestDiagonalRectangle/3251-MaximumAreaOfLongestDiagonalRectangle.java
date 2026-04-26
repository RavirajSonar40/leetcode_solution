// Last updated: 27/04/2026, 04:05:04
class Solution {
    public int areaOfMaxDiagonal(int[][] arr) {
        int maxSqSum = Integer.MIN_VALUE;
        int maxProduct = Integer.MIN_VALUE; 

        for (int r = 0; r < arr.length; r++) {
            int a = arr[r][0];
            int b = arr[r][1];
            int sqSum = a * a + b * b;
            int product = a * b;

           
            if (sqSum > maxSqSum || (sqSum == maxSqSum && product > maxProduct)) {
                maxSqSum = sqSum;
                maxProduct = product;
            }
        }

        return maxProduct;
    }
}