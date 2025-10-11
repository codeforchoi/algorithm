import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int totalHours = 0;
        for (int i = 0; i < n; i++) {
            totalHours += Integer.parseInt(st.nextToken());
            totalHours += 8;
        }
        totalHours -= 8;
        sb.append(totalHours / 24).append(" ").append(totalHours % 24);
        System.out.println(sb);
    }
}