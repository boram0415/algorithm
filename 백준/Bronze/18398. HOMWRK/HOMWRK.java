import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 테스트 케이스의 수 T를 입력 받음
        int T = scanner.nextInt();

        // T만큼 반복
        for (int t = 0; t < T; t++) {
            // 각 테스트 케이스의 문제 수 N을 입력 받음
            int N = scanner.nextInt();
            int[] results = new int[2 * N]; // 합과 곱을 저장할 배열

            // N만큼 반복
            for (int i = 0; i < N; i++) {
                int A = scanner.nextInt(); // A 입력
                int B = scanner.nextInt(); // B 입력

                results[2 * i] = A + B; // 합을 배열에 저장
                results[2 * i + 1] = A * B; // 곱을 배열에 저장
            }

            // 결과 출력
            for (int i = 0; i < 2 * N; i += 2) {
                System.out.println(results[i] + " " + results[i + 1]);
            }
        }

        scanner.close();
    }
}