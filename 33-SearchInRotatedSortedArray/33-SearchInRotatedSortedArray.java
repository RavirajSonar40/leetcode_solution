// Last updated: 27/04/2026, 04:06:31
class Solution {
    public int search(int[] arr, int target) {
       int peak = findPeak(arr);
        

        int ans = binarySearch(arr, 0, peak, target); 
        if (ans == -1) {
            ans = binarySearch(arr, peak + 1, arr.length - 1, target); 
        }
        

        return ans;
    }

   
    static int findPeak(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                
                return mid;
            }
            if (arr[mid] >= arr[start]) {
                
                start = mid + 1;
            } else {
                
                end = mid;
            }
        }
        return start; 
    }

    
    static int binarySearch(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}