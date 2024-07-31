import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int L = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < L; i++) {
            int N = scanner.nextInt();
            char symbol = scanner.next().charAt(0);
            for (int j = 0; j < N; j++) {
                System.out.print(symbol);
            }
            System.out.println(); 
        }
        
        scanner.close();
    }
}