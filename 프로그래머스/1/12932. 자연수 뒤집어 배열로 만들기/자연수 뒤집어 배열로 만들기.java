class Solution {
    public int[] solution(long n) {
        String[] arr = String.valueOf(n).split("");
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[arr.length - i - 1] = Integer.parseInt(arr[i]);
        }
        return result;
    }
}