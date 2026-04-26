// Last updated: 27/04/2026, 04:05:52
import java.util.*;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       return new AbstractList<Integer>() {
            List<Integer> ret;
            private void init(){
                if(ret != null)
                    return;
                ret = new ArrayList<>();
                int[] pCount = new int[26];
                for(int i = 0; i < p.length(); i++)
                    pCount[p.charAt(i) - 'a']++;
                for(int i = 0; i <= s.length() - p.length(); i++){
                    int[] sCount = new int[26];
                    for(int j = 0; j < p.length(); j++)
                        sCount[s.charAt(i+j) - 'a']++;
                    if(Arrays.equals(sCount, pCount))
                        ret.add(i);
                }
            }
            @Override
            public Integer get(int index) {
                if(ret == null)
                    init();
                return ret.get(index);
            }

            @Override
            public int size() {
                if(ret == null)
                    init();
                return ret.size();
            }
        };

    }
}