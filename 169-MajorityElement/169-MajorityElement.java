// Last updated: 27/04/2026, 04:06:09
class Solution {
   public int majorityElement(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int limit = nums.length / 2;

    for (int i = 0; i < nums.length; i++) {
        int num = nums[i];

        int count = map.getOrDefault(num, 0) + 1;
        map.put(num, count);

        if (count > limit) {
            return num;
        }
    }

    return -1;
}
}