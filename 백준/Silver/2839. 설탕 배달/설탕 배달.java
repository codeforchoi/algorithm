import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;

        while (true) {
            if (n % 5 == 0) {
                result += n / 5;
                break;
            }
            n -= 3;
            result++;
            if (n < 0) {
                result = -1;
                break;
            }
        }
        System.out.println(result);
    }
}