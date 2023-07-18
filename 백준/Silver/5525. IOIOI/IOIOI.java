import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String S = br.readLine();
        int cnt=0;
        sb.append("I");
        for (int i = 0; i < N; i++) {
            sb.append("OI");
        }
        String cp = sb.toString();
        int p = N+N+1;
        for (int i = 0; i < S.length()-1; i++) {
            String tmp = S.substring(i,i+p);
            if(i+p > S.length()-1){
                if (cp.equals(tmp)) {
                    cnt++;
                }
                break;
            }
            if(S.charAt(i) == 'I'){
                if (cp.equals(tmp)) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
