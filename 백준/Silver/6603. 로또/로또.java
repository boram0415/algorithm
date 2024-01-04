import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static boolean [] visited;
    static String t;
    static int [] s;
    static int k;
    public static void main(String[] args) throws  Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(!(t=br.readLine()).equals("0")){
            String [] arr=t.split(" ");
            k=Integer.parseInt(arr[0]);
            s=new int[k];
            visited=new boolean[k];
            for(int i=0;i<k;i++){
                s[i]=Integer.parseInt(arr[i+1]);
            }
            dfs(0,0);
            System.out.println();
        }
    }

    public static void dfs(int cnt,int start){
        if(cnt==6){
            for(int i=0;i<k;i++){
                if(visited[i]){
                    System.out.print(s[i]+" ");
                }
            }
            System.out.println();
        }
        for(int i=start;i<k;i++){
            visited[i]=true;
            dfs(cnt+1,i+1);
            visited[i]=false;
        }
    }
}