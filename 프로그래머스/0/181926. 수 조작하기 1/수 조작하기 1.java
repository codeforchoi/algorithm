class Solution {
    public int solution(int n, String control) {
        return control.chars().reduce(n, (temp, c) -> temp + (c == 'w' ? 1 : c == 's' ? -1 : c == 'd' ? 10 : -10));
    }
}