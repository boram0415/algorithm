import java.io.*;

class Main{
    static int read() throws Exception{
        int c=0,n=0;
        while(true){
            c = System.in.read()-48;
            if(c < 0 || c > 9) return n;
            n = n *10 +c;
        }
    }
    public static void main(String[] args) throws Exception{
        while(true){
            int a = read();
            int b = read();
            if(a == 0 && b ==0 ) return;
            if( a > b ){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
    
}