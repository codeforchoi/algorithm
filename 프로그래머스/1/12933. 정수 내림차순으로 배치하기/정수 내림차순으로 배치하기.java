import java.util.Arrays;

class Solution {
    public long solution(long n) {
        StringBuilder sb = new StringBuilder();
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);
        for (String s : list) sb.append(s);
        return Long.parseLong(sb.reverse().toString());
    }
}