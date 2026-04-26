// Last updated: 27/04/2026, 04:06:29
class Solution {
    public int searchInsert(int[] arr, int target) {
        
        int start = 0;
        int end = arr.length - 1;
        if (target > arr[arr.length - 1]) {
            return end+1;
        }

        while (start <= end) {
            
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
               
                return mid;
            }
        }
        return start;
    }
}