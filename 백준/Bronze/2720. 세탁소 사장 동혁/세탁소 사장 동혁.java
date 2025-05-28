import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int change = Integer.parseInt(br.readLine());
            int remain = change;

            int quarter = change / 25;
            sb.append(quarter).append(" ");
            remain %= 25;

            int dime = remain / 10;
            sb.append(dime).append(" ");
            remain %= 10;

            int nickel = remain / 5;
            sb.append(nickel).append(" ");
            remain %= 5;

            int penny = remain;
            sb.append(penny).append("\n");
        }
        System.out.println(sb);
    }
}