import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int n = nums.length / 2;		
		Map<Integer, Integer> phoneketmonCount = new HashMap<>();
		
		for(int num : nums) {
			phoneketmonCount.put(num, phoneketmonCount.getOrDefault(num, 0) + 1);
		}	
		
		return Math.min(n, phoneketmonCount.size());
    }
}