// Last updated: 27/04/2026, 04:05:34
class Solution {
    public boolean backspaceCompare(String s, String t) {
          Deque<Character> stack1 = new LinkedList<>();
        Deque<Character> stack2 = new LinkedList<>();

        for(char c:s.toCharArray()){
            if(c=='#'){
                if(!stack1.isEmpty()){
                    stack1.pop();
                }
            } else {
                stack1.push(c);
            }
        }

        for(char c:t.toCharArray()){
            if(c=='#'){
                if(!stack2.isEmpty()){
                    stack2.pop();
                }
            } else {
                stack2.push(c);
            }
        }

        return stack1.equals(stack2);
    }
}