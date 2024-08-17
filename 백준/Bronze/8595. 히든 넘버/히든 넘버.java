import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine(); // 첫 번째 줄은 사용하지 않음
        long ans = 0;
        String input = br.readLine();

        int length = input.length();
        int number = 0;
        boolean isNumber = false;

        for (int i = 0; i < length; i++) {
            char c = input.charAt(i);

            if (c >= '0' && c <= '9') { // 숫자 문자만 처리
                number = number * 10 + (c - '0');
                isNumber = true;
            } else if (isNumber) {
                ans += number;
                number = 0;
                isNumber = false;
            }
        }

        if (isNumber) {
            ans += number; // 마지막에 남은 숫자 처리
        }

        System.out.println(ans);
    }
}