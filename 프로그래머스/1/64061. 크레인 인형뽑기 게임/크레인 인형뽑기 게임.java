import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Deque<Integer> stack = new ArrayDeque<>();
		int n = board.length;
		int count = 0;
		
		for(int m : moves) {
			for(int i = 0; i < n; i++) {
				if(board[i][m - 1] == 0) continue;
				
				int doll = board[i][m - 1];
				board[i][m - 1] = 0;
				
				if(!stack.isEmpty() && stack.peek() == doll) {
					stack.pop();					
					count += 2;
				} else {
					stack.push(doll);
				}
				
				break;
			}
		}       
        return count;
    }
}