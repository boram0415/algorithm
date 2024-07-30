import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();  // Number of candidates

        int[] votes = new int[N];
        for (int i = 0; i < N; i++) {
            votes[i] = scanner.nextInt();  // Votes each candidate received
        }

        int maxVotes = votes[0];  // Carlos is the first candidate
        boolean carlosWins = true;  // Assume Carlos wins initially

        for (int i = 1; i < N; i++) {
            if (votes[i] > maxVotes) {
                carlosWins = false;  // Someone has more votes than Carlos
                break;
            } else if (votes[i] == maxVotes) {
                // If tie, Carlos still wins because he registered first
                carlosWins = true;
            }
        }

        if (carlosWins) {
            System.out.println("S");  // Carlos elected
        } else {
            System.out.println("N");  // Carlos not elected
        }

        scanner.close();
    }
}