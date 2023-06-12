import java.io.*;
import java.util.*;
class Main{
    
    static int N = 1003001;
    static boolean [] isPrime = new boolean[N+1];
    
    static boolean palindrome(int n){
        int cp = n , tmp =0,rev=0;
        while(cp != 0){
            tmp = cp % 10;
            rev = rev * 10 + tmp ;
            cp /= 10;
        }
        return n == rev ? true : false ;
    }
    
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        // 소수 판별
        for(int i=2;i<=(int)Math.sqrt(N);i++){
            for(int j=i*i; j<=N;j+=i){
                isPrime[j]=true;
            }
        }
        isPrime[1]=true;
        int t = Integer.parseInt(br.readLine());
        for(int i = t; t < N ; i++){
            if(!isPrime[i]){
                if(palindrome(i)){
                    System.out.print(i);
                    break;
                }
            }
        }
    }
}
