import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;
        int n;
        while (true) {
            n = Integer.parseInt(br.readLine());
            if (n == -1) {
                break;
            }
            total += n;
        }
        System.out.println(total);
    }
}