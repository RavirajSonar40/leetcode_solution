// Last updated: 27/04/2026, 04:05:33
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else {
                if (arr[mid] > arr[mid - 1]) {
                    start = mid + 1;
                } else if (arr[mid] < arr[mid + 1]) {
                    end = mid - 1;
                } else if (arr[mid] < arr[mid - 1]) {
                    end = mid;
                } else if (arr[mid] > arr[mid + 1]) {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}
