import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();  // 입력: 테스트 케이스의 수
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            long K = (long) N * N;  // N의 제곱을 계산 (long 타입으로 처리)
            sb.append(K).append("\n");
        }
        
        System.out.print(sb.toString());
        
        scanner.close();
    }
}