import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String num = br.readLine();
        long remainder = 0;
        for (int i = 0; i < num.length(); i++) {
            remainder = (remainder * 10 + (num.charAt(i) - '0')) % 20000303;
        }
        sb.append(remainder);
        System.out.println(sb);
    }
}