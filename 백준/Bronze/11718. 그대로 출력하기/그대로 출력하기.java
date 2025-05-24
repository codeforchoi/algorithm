import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = "";
        int count = 0;

        while ((str = br.readLine()) != null) {
            sb.append(str.trim()).append("\n");
            count++;
            if (count > 100) {
                break;
            }
        }
        System.out.println(sb);
    }
}