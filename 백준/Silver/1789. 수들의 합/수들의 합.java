import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long S = scanner.nextLong();
        scanner.close();

        long sum = 0;
        int N = 0;

        for (int i = 1; sum + i <= S; i++) {
            sum += i;
            N++;
        }

        System.out.println(N);
    }
}