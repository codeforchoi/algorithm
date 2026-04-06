class Solution {
    public int solution(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            int count = 1;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            sum += i * ((count % 2 == 0) ? 1 : -1);
        }
        return sum;
    }
}