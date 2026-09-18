import java.util.*;

class Solution {
    private static int[] number = {781, 156, 31, 6, 1};
    
    public int solution(String word) {
        int answer = 0;
		Map<Character, Integer> map = new HashMap<>();
		map.put('A', 0);
		map.put('E', 1);
		map.put('I', 2);
		map.put('O', 3);
		map.put('U', 4);
		
		for(int i = 0; i < word.length(); i++) {
			answer += map.get(word.charAt(i)) * number[i] + 1;
		}	
		return answer;
    }
}