// Last updated: 27/04/2026, 04:05:49
class Solution {
    public String frequencySort(String s) {
         HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Step 2: Buckets (index = frequency)
        List<Character>[] bucket = new ArrayList[s.length() + 1];

        for (char key : map.keySet()) {
            int freq = map.get(key);

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }

            bucket[freq].add(key);
        }

        // Step 3: Build result from highest freq
        StringBuilder result = new StringBuilder();

        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] != null) {
                for (char ch : bucket[i]) {
                    for (int j = 0; j < i; j++) {
                        result.append(ch);
                    }
                }
            }
        }

        return result.toString();
    }
}