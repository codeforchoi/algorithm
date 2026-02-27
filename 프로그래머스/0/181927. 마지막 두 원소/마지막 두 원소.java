import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int n = num_list.length;
        int[] result = Arrays.copyOf(num_list, n + 1);
        result[n] = num_list[n - 1] > num_list[n - 2] ? num_list[n - 1] - num_list[n - 2] : num_list[n - 1] * 2;
        return result;
    }
}