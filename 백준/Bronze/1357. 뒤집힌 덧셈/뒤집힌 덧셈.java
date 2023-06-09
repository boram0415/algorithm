import java.io.*;
import java.util.*;
class Main {
    
    static StringBuilder sb ;
    
    static int reverse(int n){
        sb=new StringBuilder();
        sb.append(n);
        sb.reverse();
        return Integer.parseInt(sb.toString());
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        System.out.println(reverse(reverse(X)+reverse(Y)));
    }
}