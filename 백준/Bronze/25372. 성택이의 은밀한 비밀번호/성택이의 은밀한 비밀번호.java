import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        while(N-- > 0){
            int len = br.readLine().length();
            if(len <= 9 && len >= 6) sb.append("yes").append("\n");
            else sb.append("no").append("\n"); 
        }
        System.out.print(sb);
        
    }
}