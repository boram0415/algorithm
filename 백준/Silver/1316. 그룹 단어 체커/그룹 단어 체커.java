import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), cnt = n;
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            boolean arr[] = new boolean[26];
            for (int j = 0; j < str.length()-1; j++) {
                if (str.charAt(j) == str.charAt(j + 1)) {
                    continue;
                } else if (str.charAt(j) != str.charAt(j + 1) && arr[str.charAt(j + 1) - 97] == true) {
                    cnt--;
                    break;
                }
                arr[str.charAt(j) - 97] = true;
            }
        }
        System.out.println(cnt);
    }
}
