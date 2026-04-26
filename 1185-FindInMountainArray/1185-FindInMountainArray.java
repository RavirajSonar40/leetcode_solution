// Last updated: 27/04/2026, 04:05:27
class Solution {
    public int findInMountainArray(int target, MountainArray arr) {
        int n = arr.length();

        
        int start = 0;
        int end = n - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) > arr.get(mid + 1)) {
                end = mid; 
            } else {
                start = mid + 1; 
            }
        }
        int peak = start;

        
        int index = binarySearch(arr, target, 0, peak, true);
        if (index != -1) return index;

      
        return binarySearch(arr, target, peak + 1, n - 1, false);
    }

  
    static int binarySearch(MountainArray arr, int target, int start, int end, boolean ascending) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = arr.get(mid);

            if (midVal == target) return mid;

            if (ascending) {
                if (target < midVal) end = mid - 1;
                else start = mid + 1;
            } else {
                if (target > midVal) end = mid - 1;
                else start = mid + 1;
            }
        }
        return -1;
    }
}
