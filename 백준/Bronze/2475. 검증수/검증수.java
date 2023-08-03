import java.util.*;

class Main{
    static int read() throws Exception{
        int c,n=0;
        while(true){
            c = System.in.read()-48;
            if(c < 0 || c > 9) return n;
            n = n*10+c;
        }
    }

    public static void main(String[] args) throws Exception {
        int result=0;
        for(int i=0;i<5;i++){
            result+=(int)Math.pow(read(),2);
        }
        System.out.print(result % 10);
    }
}