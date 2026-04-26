// Last updated: 27/04/2026, 04:06:11
class Solution {
    public int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                
                end = mid;
            } else {
                
                start = mid + 1;
            }
        }
        
        return start;
    }
    }
