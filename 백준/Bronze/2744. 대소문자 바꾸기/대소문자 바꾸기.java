import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception{
        String str = new BufferedReader(new InputStreamReader(System.in)).readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            String tmp = String.valueOf(str.charAt(i));
            if(str.charAt(i) >= 'a' ) sb.append(tmp.toUpperCase());
            else sb.append(tmp.toLowerCase());
        }
        System.out.println(sb);
    }
}
