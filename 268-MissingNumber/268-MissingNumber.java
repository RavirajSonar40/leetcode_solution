// Last updated: 27/04/2026, 04:05:59
class Solution {
    public int missingNumber(int[] arr) {
        cyclicsort(arr);
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != i){
                return i;
            }
        }
        return arr.length;
    }

    static void cyclicsort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}