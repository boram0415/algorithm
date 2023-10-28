import java.io.IOException;
import java.util.*;

class Main {
    static int[] arr= {300,60,10};
    static int[] basket = new int[3];
    public static void main(String args[]) throws Exception{
        int N = read(),tmp=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > N) continue;
            basket[i]=N/arr[i];
            N = N % arr[i];
        }
        System.out.print(N==0? basket[0] +" "+basket[1]+" "+basket[2] : -1);
    }
    public static int read() throws IOException {
        int c=0,n=0;
        while(true){
            c = System.in.read()-48;
            if(c < 0 || c > 9) return n;
            n=n*10+c;
        }
    }
}