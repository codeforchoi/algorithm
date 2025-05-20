import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        int[] info = new int[N];

        for (int l = 0; l < M; l++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()) - 1;
            int j = Integer.parseInt(st.nextToken()) - 1;
            int k = Integer.parseInt(st.nextToken());

            for (int o = i; o <= j; o++) {
                info[o] = k;
            }
        }

        for (int i = 0; i < N; i++) {
            if (i == (N - 1)) {
                sb.append(info[i]);
            } else {
                sb.append(info[i]).append(" ");
            }
        }
        System.out.println(sb);
    }
}