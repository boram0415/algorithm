import java.io.*;
import java.util.*;
class Main{
    public static void main(String arge[] ) throws Exception{

        BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(50);
        int T = Integer.parseInt(br.readLine());

        for(int i=0;i<T;i++){
            int tmp=T-i;
            while(tmp-- >0){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}