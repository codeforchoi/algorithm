import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        // 제일 위가 First, 제일 아래가 Last
        for (int i = 1; i <= n; i++) {
            deque.offerLast(i);
        }

        while (deque.size() > 1) {
            deque.pollFirst();
            int num = deque.pollFirst();
            deque.offerLast(num);
        }
        System.out.println(deque.peekFirst());
    }
}