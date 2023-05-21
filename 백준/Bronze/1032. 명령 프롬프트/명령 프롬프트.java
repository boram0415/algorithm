import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        // 입력 횟수
        int cnt = Integer.parseInt(br.readLine());
        String fir = br.readLine();
        String answer = fir;
        while (cnt > 1) {
            cnt--;
            String str = br.readLine();
            for (int i = 0; i < fir.length(); i++) {
                if (answer.charAt(i) == (str.charAt(i))) {
                    sb.append(fir.charAt(i));
                } else {
                    sb.append("?");
                }
            }
            answer = sb.toString();
            sb.setLength(0);
        }
        System.out.print(answer);
    }
}