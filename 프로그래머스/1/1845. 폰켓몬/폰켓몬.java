import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int n = nums.length / 2;
		int maxCount = 0;
		Map<Integer, Integer> phoneketmonCount = new HashMap<>();
		
		for(int num : nums) {
			phoneketmonCount.put(num, phoneketmonCount.getOrDefault(num, 0) + 1);
		}
		
		for(int key : phoneketmonCount.keySet()) {
			if(maxCount >= n) {
				break;
			}
			maxCount++;
		}
		
		return maxCount;
    }
}