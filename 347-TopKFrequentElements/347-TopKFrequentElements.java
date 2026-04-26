// Last updated: 27/04/2026, 04:05:54
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         HashMap<Integer, Integer> map = new HashMap<>();
       
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
 
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
  
        list.sort((a, b) -> a.getValue().compareTo(b.getValue()));

        Map<Integer, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        int[] result = new int[k];
        int n = list.size();

        for (int i = 0; i < k; i++) {
            result[i] = list.get(n - k + i).getKey();
        }

        return result;
    }
}