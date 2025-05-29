import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());
        int totalSum = 0;
        int min = end + 1;

        for (int i = start; i <= end; i++) {
            boolean flag = true;
            if (i == 1) {
                flag = false;
            }

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                totalSum += i;
                if (i < min) {
                    min = i;
                }
            }
        }
        if (totalSum == 0) {
            sb.append(-1);
        } else {
            sb.append(totalSum).append("\n").append(min);
        }
        System.out.println(sb);
    }
}