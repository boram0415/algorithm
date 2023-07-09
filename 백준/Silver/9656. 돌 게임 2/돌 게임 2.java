import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {

        static boolean flag = false; // true = 상근 , false = 창영
        static int i = 3;
        static int y = 1;

        static void play(int n) {
            while(n != 0){
                if (n - i > -1) {
                    n -= i;
                    flag = !flag;
                }else{
                    n -= y;
                    flag = !flag;
                }
            }
        }

        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            play(Integer.parseInt(br.readLine()));
            System.out.println(flag == true ? "CY" : "SK");
        }
    }
