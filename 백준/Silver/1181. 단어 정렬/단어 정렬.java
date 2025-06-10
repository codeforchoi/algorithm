import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        String[] words = new String[n];
        for (int i = 0; i < words.length; i++) {
            words[i] = br.readLine();
        }

        Arrays.sort(words, (w1, w2) -> {
            if (w1.length() == w2.length()) {
                return w1.compareTo(w2);
            } else {
                return w1.length() - w2.length();
            }
        });

        String prev = "";
        for (String word : words) {
            if (prev.equals(word)) {
                continue;
            }
            sb.append(word).append("\n");
            prev = word;
        }
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}