import java.io.*;
import java.util.*;

class Main{
    static boolean isPrime[];
    static boolean pal(int n){
        int result=0,cp=n,tmp=0;
        while (cp !=0) {
            tmp = cp%10;
            result = result * 10 + tmp;
            cp /= 10;
        }
        return result == n;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        isPrime = new boolean[b+1];
        //에토체 소수 구하기
        for (int i = 2; i <= (int) Math.sqrt(b); i++) {
            if(isPrime[i]) continue;
            for (int j = i * i; j <= b; j += i) {
                if (!isPrime[j]) isPrime[j] = true;
            }
        }
        for(int i=a;i<=b;i++){
            if(!isPrime[i] && pal(i)){
                sb.append(i).append("\n");
            }
        }
        sb.append(-1);
        System.out.print(sb);
    }
}