import java.io.*;
import java.util.*;
class Main{
   public static void main(String[] args) throws Exception{
       
       int I = read(),J=read();
       int arr[]=new int[I+1];
       StringBuilder sb = new StringBuilder(16);
       for(int i=1;i<=I;i++){
           arr[i]=read();
       }
       
       for(int i=1;i<=I;i++){
           arr[i]=arr[i-1]+arr[i];
       }
       for(int i=0;i<J;i++){
           int f = read(),s =read();
           sb.append(arr[s]-arr[f-1]).append("\n");
       }
       System.out.print(sb);
   }
    
    public static int read() throws IOException {
        int c= 0 , n =0;
        while(true){
            c = System.in.read()-48;
            if(c < 0 || c > 9) return n;
            n = n * 10 + c;
        }
     }

}