import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String result = String.valueOf(a * b * c);
        int length = result.length();
        int[] number = new int[10];

        for (int i = 0; i < length; i++) {
            number[result.charAt(i) - '0']++;
        }

        for (int i : number) {
            sb.append(i).append("\n");
        }
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}