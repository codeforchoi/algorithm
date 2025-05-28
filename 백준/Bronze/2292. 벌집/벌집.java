import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 1;
        int step = 1;

        while ((n - step) > (6 * count)) {
            step += (6 * count);
            count++;
        }
        if (n != 1) {
            count++;
        }
        System.out.println(count);
    }
}