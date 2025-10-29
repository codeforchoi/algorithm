import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += Integer.parseInt(st.nextToken());
        }

        int n = Integer.parseInt(st.nextToken());
        if (sum / 4 < n) {
            System.out.println(4 * n - sum);
        } else {
            System.out.println(0);
        }
    }
}