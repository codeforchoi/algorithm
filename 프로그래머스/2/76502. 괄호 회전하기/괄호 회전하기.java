import java.util.*;

class Solution {
    public int solution(String s) {
        Map<Character, Character> map = new HashMap<>();
		map.put(')', '(');
		map.put('}', '{');
		map.put(']', '[');
		
		int n = s.length();
		s += s;
		int count = 0;
		
		outer: for(int i = 0; i < n; i++) {
			Deque<Character> stack = new ArrayDeque<>();
			for(int j = i; j < i + n; j++) {
				char c = s.charAt(j);
				if(!map.containsKey(c)) {
					stack.push(c);
				} else {
					if(stack.isEmpty() || stack.pop() != map.get(c)) {
						continue outer;
					}
				}
			}
			
			if(stack.isEmpty()) count++;
		}
		return count;
    }
}