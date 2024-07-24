import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 정수 N 입력 받기
        int N = scanner.nextInt();
        
        // "SciComLove" N번 출력
        for (int i = 0; i < N; i++) {
            System.out.println("SciComLove");
        }
        
        scanner.close();
    }
}