import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            int M = Integer.parseInt(br.readLine());
            String str = br.readLine();
            int sum = 0,cnt=0;
            for (int i = 1; i <M-1; i++) {
                if (str.charAt(i-1) == 'I' && str.charAt(i) == 'O' && str.charAt(i+1) == 'I') {
                    cnt++;
                    if(cnt == N) {
                        cnt--;
                        sum++;
                    }
                    i++;
                }else{
                    cnt=0;
                }
            }
            System.out.println(sum);

        } 
    } 