import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int first = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        first += Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
        first = (first - 2) % 4 + 1;
        System.out.println(first);
    }
}