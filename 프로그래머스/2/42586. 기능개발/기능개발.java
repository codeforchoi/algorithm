import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new ArrayDeque<>();
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < progresses.length; i++) {
			int remain = 100 - progresses[i];
			int divide = speeds[i];
			int result = remain / divide;
			int day = (int) Math.ceil((double)remain / divide);
			q.offer(day);
		}
		
		int maxPeriod = q.poll();
		int count = 1;
		while(!q.isEmpty()) {
			int period = q.poll();
			if(period <= maxPeriod) {
				count++;
			} else {
                maxPeriod = period;
				list.add(count);
				count = 1;
			}			
		}
		list.add(count);
		return list.stream().mapToInt(Integer::intValue).toArray();
    }
}