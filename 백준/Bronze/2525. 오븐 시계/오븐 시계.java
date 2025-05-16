import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int totalMinutes = A * 60 + B + C;
        System.out.println(((totalMinutes / 60) % 24) + " " + (totalMinutes % 60));
    }
}