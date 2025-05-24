import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("");
        int totalTime = 0;

        for (String s : str) {
            char ch = s.charAt(0);
            if (ch <= 'C') {
                totalTime += 3;
            } else if (ch <= 'F') {
                totalTime += 4;
            } else if (ch <= 'I') {
                totalTime += 5;
            } else if (ch <= 'L') {
                totalTime += 6;
            } else if (ch <= 'O') {
                totalTime += 7;
            } else if (ch <= 'S') {
                totalTime += 8;
            } else if (ch <= 'V') {
                totalTime += 9;
            } else {
                totalTime += 10;
            }
        }
        System.out.println(totalTime);
    }
}