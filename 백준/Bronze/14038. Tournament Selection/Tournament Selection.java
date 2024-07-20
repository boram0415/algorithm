import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int wins = 0;
        for (int i = 0; i < 6; i++) {
            char result = (char) reader.read();
            if (result == 'W') {
                wins++;
            }
            // Read the newline character
            reader.read();
        }
        
        int group;
        switch (wins) {
            case 5:
            case 6:
                group = 1;
                break;
            case 3:
            case 4:
                group = 2;
                break;
            case 1:
            case 2:
                group = 3;
                break;
            default:
                group = -1;
                break;
        }
        
        System.out.println(group);
    }
}