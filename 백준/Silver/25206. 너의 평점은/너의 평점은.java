import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double gpa = 0;
        double creditsSum = 0;
        double totalSum = 0;

        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken(); // 쓰이진 않음.
            double credits = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            if (!grade.equals("P")) {
                creditsSum += credits;
                totalSum += credits * gradeToScore(grade);
            }
        }

        gpa = totalSum / creditsSum;
        System.out.println(gpa);
    }

    public static double gradeToScore(String grade) {
        double score = 0;
        if (grade.equals("A+")) {
            score = 4.5;
        } else if (grade.equals("A0")) {
            score = 4.0;
        } else if (grade.equals("B+")) {
            score = 3.5;
        } else if (grade.equals("B0")) {
            score = 3.0;
        } else if (grade.equals("C+")) {
            score = 2.5;
        } else if (grade.equals("C0")) {
            score = 2.0;
        } else if (grade.equals("D+")) {
            score = 1.5;
        } else if (grade.equals("D0")) {
            score = 1.0;
        } else if (grade.equals("F")) {
            score = 0.0;
        } else { // P일 경우
            score = 0;
        }
        return score;
    }
}