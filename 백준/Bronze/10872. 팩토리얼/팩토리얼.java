import java.util.*;

class Main{
    static int tmp;
    static int read() throws Exception{
        int c,n=0;
        while(true){
            c = System.in.read()-48;
            if(c < 0 || c > 9) return n;
            n = n*10+c;
        }
    }

    static int fac(int n) {
        if (n == 1) return n;
        return fac(n-1)*n;
    }

    public static void main(String[] args) throws Exception {
        int N =read();
        System.out.println(N == 0 ? 1 : fac(N));
    }
}