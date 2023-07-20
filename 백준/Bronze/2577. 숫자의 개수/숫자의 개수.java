import java.util.Arrays;

public class Main {

    private static int read() throws Exception {
        int c, n = 0;
        while (true) {
            c = System.in.read()-48;
            if (c < 0 || c > 9) return n;
            n = n * 10 + c;
        }
    }
    public static void main(String[] args) throws Exception{
        StringBuilder sb = new StringBuilder();
        int arr[] = new int[10];
        int mul =read()*read()*read();
        while (mul > 0) {
            int tmp = mul % 10;
            mul /=10;
            arr[tmp]++;
        }
        for(int a : arr) sb.append(a).append("\n");
        System.out.println(sb);
    }
}
