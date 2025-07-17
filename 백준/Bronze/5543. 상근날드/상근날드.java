import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int mintBurger = 2001;
        int minBeverage = 2001;

        for (int i = 0; i < 3; i++) {
            int price = Integer.parseInt(br.readLine());
            if (price < mintBurger) {
                mintBurger = price;
            }
        }

        for (int i = 0; i < 2; i++) {
            int price = Integer.parseInt(br.readLine());
            if (price < minBeverage) {
                minBeverage = price;
            }
        }
        System.out.println(mintBurger + minBeverage - 50);
    }
}