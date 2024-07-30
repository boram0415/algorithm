import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfCandidates = Integer.parseInt(reader.readLine());
        int maxVotes = Integer.parseInt(reader.readLine()); 
        boolean carlosWins = true;

        for (int i = 1; i < numberOfCandidates; i++) {
            int currentVotes = Integer.parseInt(reader.readLine());
            if (currentVotes > maxVotes) {
                carlosWins = false;
                break;
            }
        }

        System.out.println(carlosWins ? "S" : "N");
        reader.close();
    }
}