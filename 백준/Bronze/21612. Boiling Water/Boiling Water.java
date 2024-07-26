import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int B = scanner.nextInt();
        scanner.close();

        // 대기압 계산
        int P = 5 * B - 400;

        // 위치 결정
        int seaLevelStatus;
        if (P < 100) {
            seaLevelStatus = 1; // Above sea level
        } else if (P > 100) {
            seaLevelStatus = -1; // Below sea level
        } else {
            seaLevelStatus = 0; // At sea level
        }

        // 결과 출력
        System.out.println(P);
        System.out.println(seaLevelStatus);
    }
}