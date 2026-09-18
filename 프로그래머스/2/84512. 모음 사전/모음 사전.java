class Solution {
    private int[] number = {781, 156, 31, 6, 1};
    
    public int solution(String word) {
        int answer = 0;
		for(int i = 0; i < word.length(); i++) {
			answer += toIndexOf(word.charAt(i)) * number[i] + 1;
		}	
		return answer;
    }
    
    private int toIndexOf(char ch) {
		return "AEIOU".indexOf(ch);
	}
}