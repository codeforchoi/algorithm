class Solution {
    public long solution(long n) {
        long x = (long) Math.sqrt(n);
        return x * x == n ? (long) Math.pow(x + 1, 2) : -1;
    }
}