class Solution {
    boolean solution(String s) {
        long p = s.chars().filter(c -> c == 'p' || c == 'P').count();
        long y = s.chars().filter(c -> c == 'y' || c == 'Y').count();
        return (p == y);
    }
}