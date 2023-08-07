import java.io.*;
import java.util.Arrays;

class Main {
    static int f;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        // N값 세팅
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
            if (arr[i].equals("?")) f = i;
        }
        // M값 세팅......ㅂㄷㅂㄷ
        int M = Integer.parseInt(br.readLine());
        String[] tmp = new String[M];
        for (int i = 0; i < M; i++) {
            tmp[i] = br.readLine();
        }
        char str = ' ';
        // N==1이면 tmp 값 0번째 바로 리턴...
        if (N == 1) {
            System.out.println(tmp[0]);
            return;
        }
        // ?의 위치가 끝인지 중간인지
        // ?
        // 1
        // 2
        // 이경우 if
        char a = ' ';
        if (f == 0) {
            str = arr[f + 1].charAt(0);
        } else if(f == N-1){
            str = arr[f - 1].charAt(arr[f - 1].length() - 1);
        }else{
            str = arr[f-1].charAt(arr[f - 1].length() - 1);
            a = arr[f+1].charAt(0);
        }
        Arrays.sort(arr);
        for (int i = 0; i < M; i++) {
            if (f == 0) {
                if (Arrays.binarySearch(arr, tmp[i]) < 0 && tmp[i].charAt(tmp[i].length() - 1) == str) {
                    System.out.println(tmp[i]);
                    return;
                }
            } else if(f == N-1) {
                if (Arrays.binarySearch(arr, tmp[i]) < 0 && tmp[i].charAt(0) == str) {
                    System.out.println(tmp[i]);
                    return;
                }
            }else{
                if (Arrays.binarySearch(arr, tmp[i]) < 0 && tmp[i].charAt(0) == str && tmp[i].charAt(tmp[i].length()-1) == a ) {
                    System.out.println(tmp[i]);
                    return;
                }
            }
        }

    }
}