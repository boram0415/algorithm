import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력값 읽기
        int S = scanner.nextInt(); // small treats
        int M = scanner.nextInt(); // medium treats
        int L = scanner.nextInt(); // large treats

        // 행복 점수 계산
        int happinessScore = 1 * S + 2 * M + 3 * L;

        // 행복 여부 판단 및 출력
        if (happinessScore >= 10) {
            System.out.println("happy");
        } else {
            System.out.println("sad");
        }

        // 스캐너 닫기
        scanner.close();
    }
}