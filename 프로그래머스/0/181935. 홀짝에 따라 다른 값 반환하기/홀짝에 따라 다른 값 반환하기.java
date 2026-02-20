class Solution {
    public static int solution(int n) {
        int sum = 0;
        if (n % 2 == 1) {
            for (int i = n; i > 0; i = i - 2) {
                sum += i;
            }
            return sum;
        } else {
            for (int i = n; i > 0; i = i - 2) {
                sum += i * i;
            }
            return sum;
        }
    }
}