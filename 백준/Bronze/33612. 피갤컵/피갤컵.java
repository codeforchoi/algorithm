import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int period = 7 * (n - 1);
        int year = 2024 + period / 12;
        int month = 8 + period % 12;
        if (month > 12) {
            month %= 12;
            year++;
        }
        sb.append(year).append(" ").append(month);
        System.out.println(sb);
    }
}