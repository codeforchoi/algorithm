class Solution {
    boolean solution(String s) {
        long p = s.toUpperCase().chars().filter(c -> c == 'P').count();
        long y = s.toUpperCase().chars().filter(c -> c == 'Y').count();
        return (p == y);
    }
}