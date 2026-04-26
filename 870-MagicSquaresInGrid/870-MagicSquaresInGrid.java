// Last updated: 27/04/2026, 04:05:39
import java.util.*;

class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        Set<Long> magic = new HashSet<>(Arrays.asList(
            0x276951438L, 0x294753618L, 0x438951276L, 0x492357816L,
            0x618753294L, 0x672159834L, 0x816357492L, 0x834159672L
        ));

        int rows = grid.length, cols = grid[0].length;
        int count = 0;

        for (int i = 0; i <= rows - 3; i++) {
            for (int j = 0; j <= cols - 3; j++) {

                // Center must be 5
                if (grid[i+1][j+1] != 5) continue;

                boolean[] used = new boolean[10];
                boolean valid = true;

                // Check digits 1–9 and uniqueness
                for (int r = 0; r < 3 && valid; r++) {
                    for (int c = 0; c < 3; c++) {
                        int v = grid[i+r][j+c];
                        if (v < 1 || v > 9 || used[v]) {
                            valid = false;
                            break;
                        }
                        used[v] = true;
                    }
                }
                if (!valid) continue;

                // Encode the 3×3 square
                long code = 0;
                for (int r = 0; r < 3; r++) {
                    for (int c = 0; c < 3; c++) {
                        code = (code << 4) | grid[i+r][j+c];
                    }
                }

                if (magic.contains(code)) count++;
            }
        }
        return count;
    }
}
