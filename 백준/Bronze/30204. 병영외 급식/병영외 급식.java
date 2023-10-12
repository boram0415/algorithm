import java.io.*;
class Main{
    public static void main(String[] args) throws Exception{
        int N = read(),K=read();
        int result = 0;
        for(int i=0;i<N;i++) result+=read();
        System.out.print(result % K != 0 ? 0 : 1 );
    }
    
    public static int read() throws IOException {
        int c= 0 , n =0;
        while(true){
            c = System.in.read()-48;
            if(c < 0 || c > 9) return n;
            n = n * 10 + c;
        }
     }
}