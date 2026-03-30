class Solution {
    public String solution(String[] seoul) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (String s : seoul) {
            if(s.equals("Kim")) break;
            index++;
        }
        sb.append("김서방은 ").append(index).append("에 있다");
        return sb.toString();
    }
}