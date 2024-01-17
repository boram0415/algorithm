import java.util.Scanner;

public class Main {
        public static void main(String [] args) {
                Scanner sc = new Scanner(System.in);
                String[] agents = new String[5];

                // 5개의 요원 첩보원명 입력 받기
                for (int i = 0; i < 5; i++) {
                        agents[i] = sc.nextLine();
                }

                boolean foundFBI = false;
                // FBI 요원 찾기
                for (int i = 0; i < 5; i++) {
                        if (agents[i].contains("FBI")) { // 첩보원명에 FBI 포함 여부 확인
                                System.out.print((i + 1) + " ");
                                foundFBI = true;
                        }
                }
                if (!foundFBI) { // FBI 요원을 찾지 못했을 경우
                        System.out.println("HE GOT AWAY!");
                }
                sc.close();
        }
}