import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int arr[];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int tmp[] = new int[n];
        arr = new int[n];
        int K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int cnt =1;
        for (int i = arr.length-1; i >= 0; i--) {
            int max =i;
            for (int j = i-1; j >= 0; j--) {
                if (arr[max] < arr[j]) {
                    max = j;
                }
            }
            if (arr[i] < arr[max]) {
                if (cnt++ == K) {
                    System.out.println( arr[i]+ " " + arr[max]);
                    return;
                }
                swap(i, max);
            }
        }
        System.out.println("-1");
    }

    private static void swap(int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
