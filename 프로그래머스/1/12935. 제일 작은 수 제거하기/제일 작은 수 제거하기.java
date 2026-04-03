class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }

        int min = arr[0];
        int min_index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                min_index = i;
            }
        }

        int index = 0;
        int[] result = new int[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            if (i == min_index) {
                continue;
            } else {
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }
}