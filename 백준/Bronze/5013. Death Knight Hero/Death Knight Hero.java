import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // 전투의 수를 입력받음
        scanner.nextLine();  // 정수 입력 후 개행문자 처리

        int victories = 0;  // 승리한 전투의 수

        for (int i = 0; i < n; i++) {
            String sequence = scanner.nextLine();  // 각 전투의 능력 사용 시퀀스를 입력받음
            if (!sequence.contains("CD")) {  // 'CD' 패턴이 포함되어 있지 않으면
                victories++;  // 승리 카운트 증가
            }
        }

        System.out.println(victories);  // 승리한 전투의 수를 출력
        scanner.close();
    }
}