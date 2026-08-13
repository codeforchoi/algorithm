import java.util.*;

class Solution {    
    public class Process {
        int index;
        int priority;

        public Process(int index, int priority) {
            super();
            this.index = index;
            this.priority = priority;
        }		
    }

    public int solution(int[] priorities, int location) {
        Queue<Process> queue = new LinkedList<>(); // 실제 프로세스 순서 유지
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> Integer.compare(o2, o1));

        for(int i = 0; i < priorities.length; i++) {
            queue.offer(new Process(i, priorities[i]));
            pq.offer(priorities[i]);
        }

        int order = 0;

        while(!queue.isEmpty()) {
            Process process = queue.poll();

            if(process.priority == pq.peek()) {
                pq.poll();
                order++;

                if(process.index == location) {
                    return order;
                }
            } else {
                queue.offer(process);
            }
        }
        return -1;
    }
}