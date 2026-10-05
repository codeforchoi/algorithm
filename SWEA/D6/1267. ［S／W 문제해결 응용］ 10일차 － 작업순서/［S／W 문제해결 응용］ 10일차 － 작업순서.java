import java.io.*;
import java.util.*;
 
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
         
        for(int tc = 1; tc <= 10; tc++) {
            sb.append("#").append(tc).append(" ");
            st = new StringTokenizer(br.readLine());
             
            int V = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
             
            List<Integer>[] graph = new ArrayList[V + 1];
            int[] inDegree = new int[V + 1];
             
            for(int i = 1; i <= V; i++) {
                graph[i] = new ArrayList<>();
            }
             
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < E; i++) {
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                 
                graph[u].add(v);
                inDegree[v]++;
            }
             
            PriorityQueue<Integer> pq = new PriorityQueue<>();
             
            // 진입차수가 0인 것들을 우선 큐에 넣음
            for(int i = 1; i <= V; i++) {
                if(inDegree[i] == 0) pq.offer(i);
            }
             
            while(!pq.isEmpty()) {
                int cur = pq.poll();
                sb.append(cur).append(" ");
                 
                for(int v : graph[cur]) {
                    inDegree[v]--;
                    if(inDegree[v] == 0) {
                        pq.offer(v);
                    }
                }
            }
            sb.append("\n");            
        }
        System.out.println(sb);
    }
}