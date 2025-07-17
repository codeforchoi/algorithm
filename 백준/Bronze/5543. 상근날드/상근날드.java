import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] price = new int[5];
        int total = 0;

        for (int i = 0; i < 5; i++) {
            price[i] = Integer.parseInt(br.readLine());
        }

        total = Math.min(Math.min(price[0], price[1]), price[2]) + Math.min(price[3], price[4]) - 50;
        System.out.println(total);
    }
}