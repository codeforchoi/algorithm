class Solution {
    public int[] solution(int n, int m) {
        int[] result = new int[2];
        int nm = n * m;
        while (m != 0) {
            int r = n % m;
            n = m;
            m = r;
        }
        result[0] = n;
        result[1] = nm / n;
        return result;
    }
}