import java.util.*;

class Solution {
    private int minCount = Integer.MAX_VALUE;
    
    public int solution(String begin, String target, String[] words) {
       // words에 target이 없는 경우 바로 0 반환
		boolean inWords = false;
		for (String word : words) {
			if (word.equals(target)) {
				inWords = true;
			}
		}
		if (!inWords) return 0;

		// words에 target이 있는 경우 변환 시도
		
		boolean[] visited = new boolean[words.length];
		dfs(words, visited, begin, target, 0);
		return minCount;
    }
    
    private void dfs(String[] words, boolean[] visited, String cur, String target, int count) {
		if(cur.equals(target)) {
			minCount = Math.min(minCount, count);
			return;
		}
		
		for(int i = 0; i < words.length; i++) {
			if(!visited[i] && canChange(cur, words[i])) {
				visited[i] = true;
				dfs(words, visited, words[i], target, count + 1);
				visited[i] = false;
			}			
		}
	}
    
    private boolean canChange(String cur, String next) {
		int count = 0;
		
		for(int i = 0; i < cur.length(); i++) {
			if(cur.charAt(i) != next.charAt(i)) {
				count++;
			}
		}
		
		if(count == 1) {
			return true;
		}
	
		return false;
	}
}