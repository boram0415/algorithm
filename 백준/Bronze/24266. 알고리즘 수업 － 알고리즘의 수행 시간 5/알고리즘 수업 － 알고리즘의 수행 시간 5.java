import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        // 수행 횟수 계산
        long executionCount = (long) n * n * n;
        
        // 수행 횟수 출력
        System.out.println(executionCount);
        
        // 시간 복잡도 출력
        System.out.println(3);
        
        scanner.close();
    }
}