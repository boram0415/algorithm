import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] agrs ) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine()),cnt=1;
        
        for(int i=0;i<n;i++){
            String[] str = br.readLine().split(" ");;          
            for(int j=str.length-1;j >=0;j--){
                sb.append(str[j]+" ");
            }
            System.out.println("Case #"+ cnt++ + ": " +sb);
            sb.setLength(0);
        }
        
    }
}