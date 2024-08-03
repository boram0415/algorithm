import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();  // 성우와 민건이의 집까지의 거리
        int t = (L + 4) / 5;  // 거리 L을 5로 나누고, 올림 처리를 위해 4를 더함
        
        System.out.println(t);  // 계산된 최소 시간 출력
    }
}