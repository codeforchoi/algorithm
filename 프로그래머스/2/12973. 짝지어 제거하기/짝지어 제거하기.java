import java.util.*;

class Solution {
    public int solution(String s) {
        Deque<Character> stack = new ArrayDeque<>();
		for(Character ch : s.toCharArray()) {			
			if(!stack.isEmpty() && stack.peek() == ch) stack.pop();
			else stack.push(ch);
		}      
        return stack.isEmpty() ? 1 : 0;
    }
}