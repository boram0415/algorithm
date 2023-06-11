import java.io.*;
import java.util.*;

class Main{
        static int N = 1000001;
        static boolean prime[] = new boolean[N];
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        // 소수 일 경우 false 
        for(int i=2;i<N;i++){
            for(int j=i+i;j<N ; j+=i){
                if(!prime[j]){
                    prime[j]=true;
                }
            }
        }
        
       int n = 0;
       boolean ch = false;
       while((n = Integer.parseInt(br.readLine())) != 0){
           // n = 10 
           for(int i=2; i<n;i++){
               if(!prime[i] && !prime[n-i]){
                   sb.append(n + " = " + i + " + " + (n-i) + "\n");
                   ch = true;
                   break;
               }
                   
           }
       }
        
        if(!ch){
            System.out.print("Goldbach's conjecture is wrong.");
        }else{
            System.out.print(sb);
        }
        
    }
    
}