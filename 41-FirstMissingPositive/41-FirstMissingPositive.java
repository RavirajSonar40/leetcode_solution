// Last updated: 27/04/2026, 04:06:28
class Solution {
    public int firstMissingPositive(int[] arr) {
        System.gc();
         cyclicsort(arr);
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] != i + 1) {
            return i + 1;
        }
    }
    return arr.length + 1;
}

  static void cyclicsort(int[] arr) {
    int i = 0;
    while (i < arr.length) {
        int correct = arr[i] - 1;
        if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
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