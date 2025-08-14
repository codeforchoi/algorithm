import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            sb.append(Character.toUpperCase(line.charAt(0))).append(line.substring(1)).append("\n");
        }
        System.out.println(sb);
    }
}