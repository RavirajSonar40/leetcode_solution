// Last updated: 27/04/2026, 04:05:35
class Solution {
    public char nextGreatestLetter(char[] arr, char target) {
        
        int start = 0;
        int end = arr.length - 1;
        if (target > arr[arr.length - 1]) {
            return arr[start];
        }
         if (target== arr[arr.length - 1]) {
            return arr[start];
        }


        while(start <= end) {
            
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                start=mid+1;
            }
        }
        return arr[start];
    }
    
}