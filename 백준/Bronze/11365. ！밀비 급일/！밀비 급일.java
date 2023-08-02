import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb =new StringBuilder();


    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "";
        while (!(str = br.readLine()).equals("END")) {
            sb.append(rev(str)).append("\n");
        }
        System.out.println(sb);
    }

    private static String rev(String str) {
        StringBuilder tmp = new StringBuilder();
        return  tmp.append(str).reverse().toString();
    }
}
