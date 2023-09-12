import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c = br.readLine().charAt(0);
        switch (c) {
            case 'A':
                System.out.println("AlKor");
                break;
            case 'C':
                System.out.println("CyKor");
                break;
            case '$':
                System.out.println("$clear");
                break;
            case 'W':
                System.out.println("WiCys");
                break;
            case 'M':
                System.out.println("MatKor");
                break;
        }

    }
}
