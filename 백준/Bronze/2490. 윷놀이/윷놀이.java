import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        char[] arr = {'E', 'A', 'B', 'C', 'D'};
        int cnt = 0;
        char answer = ' ';
        // input 문자열의 0 개수 카운트
        for (int i = 0; i < 3; i++) {
            String str = br.readLine();
            cnt = 0;
            answer = ' ';
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '0') {
                    cnt++;
                }
            }
            // 카운트와 인덱스 값이 일치하면 해당 위치 인덱스 값 sb에 담기
            for (int x = 1; x < arr.length; x++) {
                if (cnt == x) {
                    sb.append(arr[x]+"\n");
                    break;
                }
                // cnt == 0 일 경우 모를 뜻함
                if (cnt == 0) {
                    sb.append("E\n");
                    break;
                }
            }
           
        }
        System.out.println(sb);
    }
}