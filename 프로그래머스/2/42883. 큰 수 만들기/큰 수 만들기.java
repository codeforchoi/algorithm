import java.util.*;

class Solution {
    public String solution(String number, int k) {
        
        Deque<Integer> dq = new ArrayDeque<>();
        
        int count = 0;
        for(char ch : number.toCharArray()) {
            int num = ch - '0';           
            
            while(!dq.isEmpty() && count < k && dq.peekLast() < num) {
                dq.pollLast();
                count++;
            }
            
            dq.offer(num);
        }
        
        StringBuilder sb = new StringBuilder();
        while(!dq.isEmpty()) {
            sb.append(dq.pollFirst());
        }
        return sb.substring(0, number.length() - k);
    }
}

// 8177252841   877584
/*

8
8 1
8 7        k = 1
8 7 7
8 7 7 2
8 7 7 5    k = 2
8 7 7 5 2
8 7 7 5 8  k = 3
8 7 7 5 8 4
8 7 7 5 8 4 1
8 7 7 5 8 4  k = 4


*/