import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (Integer element : arr) {
            if(element % divisor == 0) list.add(element);
        }
        if (list.size() == 0) list.add(-1);
        Collections.sort(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}