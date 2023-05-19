import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder temp = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        while (true) {
            String num= br.readLine();
            if (num.equals("0")) {
                break;
            }
            for (int i = num.length()-1; num.length()/2 <= i; i--) {
                temp.append(num.charAt(i));
            }
            if (num.substring(0,temp.length()).equals(temp.toString())) {
                sb.append("yes\n");
            }else{
                sb.append("no\n");
            }
            temp.setLength(0);
        }
        System.out.println(sb);
    }
}