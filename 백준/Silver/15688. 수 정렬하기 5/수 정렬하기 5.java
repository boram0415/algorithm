import java.io.*;
import java.util.Arrays;

public class Main {
    static final int N = 2000001;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i < size; i++) {
            arr[Integer.parseInt(br.readLine())+1000000]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 0){
                for (int j = 0; j < arr[i]; j++) {
                    sb.append(i-1000000).append("\n");
                }
            }
        }
        System.out.println(sb.toString().trim());
    }
}
