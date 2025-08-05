import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n;
        while (true) {
            n = Integer.parseInt(br.readLine());
            if (n <= 10) {
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            sb.append(br.readLine().toLowerCase()).append("\n");
        }
        System.out.println(sb);
    }
}