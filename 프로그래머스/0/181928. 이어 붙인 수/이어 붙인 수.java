class Solution {
    public int solution(int[] num_list) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        for (int i : num_list) {
            (i % 2 == 0 ? even : odd).append(i);
        }
        return Integer.parseInt(odd.toString()) + Integer.parseInt(even.toString());
    }
}