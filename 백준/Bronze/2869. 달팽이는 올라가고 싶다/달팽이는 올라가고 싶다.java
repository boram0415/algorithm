import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int A = Integer.parseInt(st.nextToken()) ,B = Integer.parseInt(st.nextToken()),V = Integer.parseInt(st.nextToken());
        if ((V-B)%(A-B)>0) {
            System.out.println((V-B)/(A-B)+1);
        }else{
            System.out.println((V-B)/(A-B));
        }
    }
}