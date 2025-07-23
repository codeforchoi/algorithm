import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        for (int i = 0; i < line.length(); i += 10) {
            if (i + 10 < line.length()) {
                sb.append(line.substring(i, i + 10)).append("\n");
            } else {
                sb.append(line.substring(i));
            }
        }
        System.out.println(sb);
    }
}