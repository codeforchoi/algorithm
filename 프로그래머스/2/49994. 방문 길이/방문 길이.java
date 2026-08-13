import java.util.*;

class Solution {
    public int solution(String dirs) {
        Map<Character, int[]> direction = new HashMap<>();
		direction.put('U', new int[] {0, 1});
		direction.put('D', new int[] {0, -1});
		direction.put('R', new int[] {1, 0});
		direction.put('L', new int[] {-1, 0});
		
		int x = 5;
		int y = 5;		
		
		Set<String> set = new HashSet<>();
		for (int i = 0; i < dirs.length(); i ++) {
			int[] dir = direction.get(dirs.charAt(i));
			int nx = x + dir[0];
			int ny = y + dir[1];
			
			if(nx < 0 || ny < 0 || nx > 10 || ny > 10) continue;
				
			set.add(x + " " + y + " " + nx + " " + ny);
			set.add(nx + " " + ny + " " + x + " " + y);
			
			x = nx;
			y = ny;
		}
		return set.size() / 2;
    }
}