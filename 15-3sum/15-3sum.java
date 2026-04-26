// Last updated: 27/04/2026, 04:06:39
class Solution {
    public List<List<Integer>> threeSum(int[] numsOrig) {
        List<Integer> nums = Arrays.stream(numsOrig).boxed().collect(Collectors.toList());
        Set<List<Integer>> result = new HashSet<>();
        nums.sort(null);

        for(int i=0; i<nums.size()-2; i++) {
            
            if (nums.get(i) > 0)
                break;

            if (i > 0 && nums.get(i) == nums.get(i-1))
                continue;

            int left = i+1, right = nums.size()-1;
            while (left < right) {
                if (nums.get(i) + nums.get(left) + nums.get(right) == 0) {
                    result.add(Arrays.asList(nums.get(i), nums.get(left), nums.get(right)));
                    left++;
                    right--;

                    while(left < right && nums.get(left) == nums.get(left-1)) left++;
                    // while(left < right && nums.get(right) == nums.get(right+1)) right--;
                } else if (nums.get(i) + nums.get(left) + nums.get(right) > 0)
                    right--;
                else
                    left++;
            }
        }

        return new ArrayList<>(result);
    }
}