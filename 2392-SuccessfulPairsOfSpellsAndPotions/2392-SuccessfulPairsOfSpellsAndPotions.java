// Last updated: 27/04/2026, 04:05:13
class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int maxpo = 0, maxsp = 0;
        for (int i : potions) if (i > maxpo) maxpo = i;
        for (int i : spells) if (i > maxsp) maxsp = i;
        int[] cntLst = new int[Math.max(maxsp, maxpo) + 1];
        for (int i : potions) cntLst[i]++;
        int pos = 0;
        for (int i = 1; pos < potions.length; i++) {
            for (int j = cntLst[i]; j > 0; j--) potions[pos++] = i;
        }
        for (int i : spells) cntLst[i] = -1;
        int ptr = 0;
        for (int i = maxsp; i > 0; i--) {
            if (cntLst[i] == -1) {
                for (int j = ptr; j < pos; j++) {;
                    if ((long) potions[j] * i < success) {
                        ptr = j;
                    } else {
                        cntLst[i] = pos - j;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < spells.length; i++) {
            spells[i] = Math.max(0, cntLst[spells[i]]);
        }
        return spells;
    }
}