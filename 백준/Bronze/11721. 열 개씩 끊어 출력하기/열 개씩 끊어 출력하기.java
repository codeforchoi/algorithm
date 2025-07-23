import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        int n = line.length() / 10;
        int index = 0;
        for (int i = 0; i < n; i++) {
            sb.append(line.substring(index, index + 10)).append("\n");
            index += 10;
        }
        sb.append(line.substring(n * 10));
        System.out.println(sb);
    }
}