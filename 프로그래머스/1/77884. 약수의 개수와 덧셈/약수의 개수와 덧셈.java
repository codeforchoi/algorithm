class Solution {
    public int solution(int left, int right) {
        int sum = 0;
        // 제곱수인 경우 약수의 개수가 홀수
        for (int i = left; i <= right; i++) {
            sum += (i % Math.sqrt(i) == 0) ? -i : i;
        }
        return sum;
    }
}