import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> ownedCard = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (ownedCard.containsKey(num)) {
                ownedCard.put(num, ownedCard.get(num) + 1);
            } else {
                ownedCard.put(num, 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (ownedCard.containsKey(num)) {
                sb.append(ownedCard.get(num));
            } else {
                sb.append(0);
            }
            sb.append(" ");
        }
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}