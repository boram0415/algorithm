import java.io.*;
public class Main {
    static boolean arr[] = new boolean[10001];

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(bf.readLine());
        StringBuffer sb = new StringBuffer();
        def();

        while (cnt > 0) {
            cnt--;
            int num = Integer.parseInt(bf.readLine());
            int m = num/2;

            for (int j = 0; j < arr.length; j++) {
                if (!arr[m] && !arr[num-m]) {
                    sb.append(m + " "+ (num-m)+"\n");
                    break;
                }
                m--;
            }

        }
        System.out.println(sb);
    }

    static void def(){
        arr[0]=true;
        arr[1]=true;
        for (int i = 2; i <= (int) Math.sqrt(10000); i++) {
            for (int j = 2; j * i <= 10000; j++) {
                if (!arr[i * j]) {
                    arr[j * i] = true;
                }
            }
        }
    }
}
