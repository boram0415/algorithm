import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();
        
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            int sum = 0;
            
            for (int j = 1; j <= N; j += 2) {
                sum += j;
            }
            
            System.out.println(sum);
        }
        
        scanner.close();
    }
}