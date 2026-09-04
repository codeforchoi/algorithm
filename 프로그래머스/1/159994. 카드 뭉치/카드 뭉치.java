import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> q1 = new ArrayDeque<>();
		Queue<String> q2 = new ArrayDeque<>();
		
		for(String str : cards1) {
			q1.offer(str);
		}
		
		for(String str : cards2) {
			q2.offer(str);
		}
		
		for(String word : goal) {
			boolean isCards1 = (!q1.isEmpty()) ? q1.peek().equals(word) : false;
			boolean isCards2 = (!q2.isEmpty()) ? q2.peek().equals(word) : false;
			
			if(!isCards1 && !isCards2 ) return "No";
			
			if(isCards1) q1.poll();
			else if (!q2.isEmpty() && isCards2) q2.poll();
		}
		return "Yes";
    }
}