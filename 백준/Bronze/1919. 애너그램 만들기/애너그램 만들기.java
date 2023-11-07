import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] N = br.readLine().toCharArray();
        char[] M = br.readLine().toCharArray();
        boolean visited[] = new boolean[M.length];
        int cnt=0;
        for(int i=0;i<N.length;i++){
            for(int j=0;j<M.length;j++){
                if(N[i] == M[j] && visited[j] == false){
                    visited[j] = true;
                    cnt++;
                    break;
                }
            }
        }
        System.out.print((N.length-cnt)+(M.length-cnt));

    }
}