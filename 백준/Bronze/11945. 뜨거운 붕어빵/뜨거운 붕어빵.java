import java.io.*;
import java.util.*;


class Main{
    
    static StringBuilder sb = new StringBuilder();
    
    static int read() throws IOException {    
        int c=0,n=0;
        
        while(true){
            c = System.in.read()-48;
            if(c < 0 || c > 9 ) return n;
            n = n * 10 + c;
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = read();
        int M = read();
        
        while(N-- > 0){
            sb.append(br.readLine());
            System.out.println(sb.reverse());
            sb.setLength(0);
        }
    }
}