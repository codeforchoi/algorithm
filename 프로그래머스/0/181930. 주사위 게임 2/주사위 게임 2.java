import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int a, int b, int c) {
        Set<Integer> set = new HashSet<>(Arrays.asList(a, b, c));
        int n = 4 - set.size();
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= (Math.pow(a, i) + Math.pow(b, i) + Math.pow(c, i));
        }
        return (int) result;
    }
}