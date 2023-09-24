import java.io.*;

class Main{
    public static int read() throws IOException{
        int c =0,n=0;
        while(true){
            c = System.in.read()-48;
            if(c<0 || c > 9) return n ;
            n = 10*n+c;
        }
    }
    public static void main(String[] args) throws IOException{
        System.out.print(read()-1946);
        
    }
}