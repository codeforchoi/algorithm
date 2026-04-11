import java.util.Arrays;

public class Solution {
    public int[] solution(int []arr) {
        int[] temp = new int[arr.length];
        int index = 0;
        for (int n : arr) {
            if (index == 0 || temp[index - 1] != n) {
                temp[index++] = n;
            }
        }
        int[] result = new int[index];
        return Arrays.copyOfRange(temp, 0, index);
    }
}