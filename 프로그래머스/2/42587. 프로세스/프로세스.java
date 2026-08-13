import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int order = 1;
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i = 0; i < priorities.length; i++) {			
			pq.offer(priorities[i]);
		}		
		
		while(!pq.isEmpty()) {
			for(int i = 0; i < priorities.length; i++) {
				if(priorities[i] == pq.peek()) {
					pq.poll();
					if(i == location) return order;
					order++;
				}
			}
		}
		return -1;
    }
}