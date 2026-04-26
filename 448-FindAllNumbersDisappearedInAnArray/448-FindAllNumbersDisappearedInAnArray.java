// Last updated: 27/04/2026, 04:05:50
class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        cyclicsort(arr);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
           
            if (arr[i] != i + 1) {
                list.add(i + 1);
            }
        }
        return list;
    }

    static void cyclicsort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if ( arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}