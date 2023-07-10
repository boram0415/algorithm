import java.io.*;
public class Main {
        static int cnt=0;
    public static int recursion(String s, int l, int r){
        cnt++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            String s = br.readLine();
            cnt=0;
            sb.append(recursion(s, 0, s.length() - 1)).append(" ").append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}
