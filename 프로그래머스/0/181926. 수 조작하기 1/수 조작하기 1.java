class Solution {
    public int solution(int n, String control) {
        for (String s : control.split("")) {
            switch(s) {
                case"w":
                    n++; break;
                case "s":
                    n--; break;
                case "d":
                    n += 10; break;
                case "a":
                    n -= 10; break;
                default:
            }
        }
        return n;
    }
}