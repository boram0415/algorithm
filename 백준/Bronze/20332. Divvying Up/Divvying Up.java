import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            // 콘테스트 수를 입력받음
            int n = Integer.parseInt(reader.readLine());
            long totalSum = 0;
            
            // 상금 입력받고 총합 계산
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            while (tokenizer.hasMoreTokens()) {
                totalSum += Long.parseLong(tokenizer.nextToken());
            }
            
            // 총합이 3으로 나누어지는지 확인
            if (totalSum % 3 == 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}