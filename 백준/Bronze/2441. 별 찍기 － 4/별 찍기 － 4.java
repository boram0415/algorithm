import java.io.*;
class Main{
    public static void main(String argu[]) throws Exception{
        int N = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        StringBuilder sb = new StringBuilder();
        StringBuilder tmp = new StringBuilder();
        for(int i=N;i>0;tmp.append(' ')){
            sb.append(tmp);
            for(int j=i;j>0;j--)sb.append('*');
            sb.append("\n");
            i--;
        }
        System.out.println(sb);
    }
}