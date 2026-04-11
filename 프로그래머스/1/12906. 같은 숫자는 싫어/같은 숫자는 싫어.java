import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        int temp = arr[0];
        list.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != temp) {
                list.add(arr[i]);
                temp = arr[i];
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}