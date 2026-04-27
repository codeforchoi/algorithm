import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine()); // 전화번호 개수
            String[] phoneNumbers = new String[n];

            for (int i = 0; i < n; i++) {
                phoneNumbers[i] = br.readLine();
            }

            // 1. 사전순으로 정렬
            Arrays.sort(phoneNumbers);

            // 2. 인접한 두 번호만 비교
            boolean isConsistent = true;
            for (int i = 0; i < n - 1; i++) {
                // 뒷 번호가 앞 번호로 시작하는지 확인
                if (phoneNumbers[i + 1].startsWith(phoneNumbers[i])) {
                    isConsistent = false;
                    break;
                }
            }

            // 3. 결과 출력
            if (isConsistent) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}