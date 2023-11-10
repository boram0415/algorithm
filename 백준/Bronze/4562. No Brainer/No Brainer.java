import java.io.*;
class Main{
    static int read() throws IOException{
        int c =0, n = 0;
        while(true){
           c = System.in.read()-48;
           if(c < 0 || c > 9) return n;
            n = n * 10 +c;
        }
    }
    public static void main(String[] args) throws Exception{
        int n = read();
        while(n-- > 0){
            System.out.println(read() < read() ? "NO BRAINS" : "MMM BRAINS");
        }
    }
}