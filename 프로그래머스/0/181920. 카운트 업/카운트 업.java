import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public static int[] solution(int start_num, int end_num) {
        return start_num <= end_num
                ? IntStream.rangeClosed(start_num, end_num).toArray()
                : IntStream.rangeClosed(end_num, start_num).toArray();
    }
}