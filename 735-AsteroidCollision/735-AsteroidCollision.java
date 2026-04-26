// Last updated: 27/04/2026, 04:05:38
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
       int top = -1; 

    for (int ast : asteroids) {
        boolean destroyed = false;

        while (top >= 0 && asteroids[top] > 0 && ast < 0) {
            if (asteroids[top] < -ast) {
                top--; 
            } 
            else if (asteroids[top] == -ast) {
                top--; 
                destroyed = true;
                break;
            } 
            else {
                destroyed = true; 
                break;
            }
        }

        if (!destroyed) {
            asteroids[++top] = ast;
        }
    }

    return java.util.Arrays.copyOfRange(asteroids, 0, top + 1);
    }
}