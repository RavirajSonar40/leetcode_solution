// Last updated: 27/04/2026, 04:05:21
class Solution {
    

    static public String makeGood(String s) {
        Deque<Character> stack = new java.util.LinkedList<>();
        for(char c: s.toCharArray()){;
            if(!stack.isEmpty() && Math.abs(stack.peek() - c) == 32){
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        sb.reverse();
        return sb.toString(); 
    }
}