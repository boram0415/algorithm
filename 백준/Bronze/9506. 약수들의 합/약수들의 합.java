import java.io.*;
import java.util.*;
import static java.lang.System.out;
class Main {
    public static String STR = " is NOT perfect.";
    public static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list ;
        int n = 0;
        while (true) {
            n = Integer.parseInt(br.readLine());
            // 탈출 조건문
            if (n == -1) {
                return;
            }
            list = new ArrayList<>();
            int sq = (int) Math.sqrt(n);
            int sum = 0;
            for (int i = 1; i <= sq; i++) {
                if (n % i == 0) { // 약수 중 작은 수 저장
                    list.add(i);
                    sum += i;
                    if (n / i != i) { // 약수 중 큰 수 저장
                        list.add(n / i);
                        sum += n/i;
                    }
                }
            }
            Collections.sort(list);
            // 본인 값 제외 후 sum
            sum -= n;
            int cnt = 0;
            if (sum == n) {
                sb.append(n + " = ");
                for (int i =0;i<list.size()-1;i++) {
                    cnt++;
                    sb.append(list.get(i));
                    // 마지막 + 가 붙지 않기 위한 조건문
                    if (cnt == list.size()-1) {
                        break;
                    }
                    sb.append(" + ");
                }
                out.println(sb);
                sb.setLength(0);
            } else {
                out.println(n + STR);
            }
        }
    }
}