class Solution {
    public int solution(int num) {
        if (num == 1) return 0;

        long n = num;
        int count = 0;
        while (count < 501) {
            if(n == 1) break;
            n = (n % 2 == 0) ? n / 2 : n * 3 + 1;
            count++;
        }
        if(count > 500) count = -1;
        return count;
    }
}