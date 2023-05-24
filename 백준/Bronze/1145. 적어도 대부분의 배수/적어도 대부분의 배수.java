import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arr = new int[1000000];
        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(st.nextToken());
            for (int j = 1; j < 10000; j++) {
                arr[num*j]++;
            }
        }
        for (int i =1 ; i< arr.length;i++) {
            if (arr[i] > 2) {
                System.out.println(i);
                return;
            }
        }
    }
}