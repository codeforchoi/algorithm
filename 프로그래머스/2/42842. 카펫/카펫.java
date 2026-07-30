class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;
		
		// 테두리가 있으므로 가로와 세로는 최소 3이상 
		for(int h = 3; h * h <= total; h++) {
			if(total % h != 0) {
				continue;
			}
			
			int w = total / h;
			
			if((w - 2) * (h - 2) == yellow) {
				return new int[] {w, h};
			}
		}		
		
		return new int[0];
    }
}