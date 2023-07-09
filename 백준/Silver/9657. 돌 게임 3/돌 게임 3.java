import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args ) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N % 7 ==0 || N % 7 ==2) {
            System.out.print("CY");
        }else{
            System.out.print("SK");    
        }
    }
}
