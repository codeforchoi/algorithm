class Solution {
    private static String[] vowel = { "A", "E", "I", "O", "U" };
	private static int count = 0;
	private static int answer = 0;
    
    public int solution(String word) {
        //count = 0;
		//answer = 0;
        dfs("", word, 0);
		return answer;
    }
    
    private void dfs(String cur, String target, int depth) {
		if (depth >= 5) {
			return;
		}

		for (String str : vowel) {
			String word = cur + str;
			count++;

			if (word.equals(target)) {
				answer = count;
				return;
			}

			dfs(word, target, depth + 1);

			if (answer != 0) {
				return;
			}
		}
	}
}