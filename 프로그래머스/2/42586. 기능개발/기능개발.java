import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new ArrayDeque<>();
		
		int n = progresses.length;
		int[] daysLeft = new int[n];
		for(int i = 0; i < n; i++) {
			daysLeft[i] = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
		}
		
		int count = 0;
		int maxDay = daysLeft[0];
		
		for(int i = 0; i < n; i++) {
			if(daysLeft[i] <= maxDay) {
				count++;
			} else {
				q.offer(count);
				count = 1;
				maxDay = daysLeft[i];
			}
		}
		
		q.offer(count);
		return q.stream().mapToInt(Integer::intValue).toArray();
    }
}