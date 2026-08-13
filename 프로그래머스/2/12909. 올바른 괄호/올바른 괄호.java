import java.util.*;

class Solution {
    boolean solution(String s) {
        Deque<Character> stack = new ArrayDeque<>();
		for(Character ch : s.toCharArray()) {
			if(ch == '(') {
				stack.push(ch);
			} else {
				if(!stack.isEmpty()) {
					if(stack.peek() == '(') stack.pop();
					else return false;
				} else {
					return false;
				}
			}
		}
		
		if(stack.isEmpty()) return true;
		return false;	
    }
}