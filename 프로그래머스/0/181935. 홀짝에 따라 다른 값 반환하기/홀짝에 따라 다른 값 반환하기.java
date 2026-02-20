class Solution {
   public static int solution(int n) {
        int sum = 0;
        for (int i = n; i > 0; i -= 2) {
            sum += (n % 2 == 0) ? i * i : i;
        }
        return sum;
    }
}