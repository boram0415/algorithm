import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();  // 입력: 양의 정수 n
        int steps = 0;

        while (n != 1) {
            if (n % 2 == 0) {  // n이 짝수일 경우
                n /= 2;
            } else {           // n이 홀수일 경우
                n += 1;
            }
            steps++;           // 단계 수 증가
        }

        System.out.println(steps);
        scanner.close();
    }
}