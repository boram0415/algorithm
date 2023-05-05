import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr[] = new String[5];
        int emp = 0;
        // 배열 초기화 및 length가 제일 큰 문자열 구하기
        for (int i = 0; i < arr.length; i++) {
            String temp = br.readLine();
            int length = temp.length();
            if (emp < length) emp = length;
            arr[i] = temp;
        }
        // 출력
        for (int i = 0; i < emp; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[j].length() > i) {
                    sb.append(arr[j].charAt(i));
                }
            }
        }
        System.out.println(sb);
    }

}