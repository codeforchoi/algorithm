import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
		int[] result = new int[n];
		
        Deque<Integer> stack = new ArrayDeque<>();
        
        for(int i = 0; i < n; i++) {
        	// stack이 비어있지 않거나 가격이 떨어진 경우
        	while(!stack.isEmpty() && prices[stack.peek()] > prices[i]) { 
        		int index = stack.pop();
        		result[index] = i - index;
        	}
        	stack.push(i);
        }
        
        while(!stack.isEmpty()) {
        	int index = stack.pop();
        	result[index] = (n - 1) - index;
        }       
        return result;
    }
}