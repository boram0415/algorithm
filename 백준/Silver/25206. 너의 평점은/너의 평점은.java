import java.io.*;
import java.util.StringTokenizer;
public class Main {
    static StringTokenizer st ;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=20;
        double avg=0.0,sum=0.0;

        char[] arr = {'F' ,'D', 'C', 'B', 'A'};
        while (n > 0) {
            n--;
            st = new StringTokenizer(br.readLine());
            String sub = st.nextToken();
            double s = Double.parseDouble(st.nextToken());
            String a = st.nextToken();
            char f = a.charAt(0);
            if ( f != 'P' && f != 'F' ) {
            sum+=s;
            char e = a.charAt(1);
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == f && e =='+') {
                        avg +=((i+0.5)*s);
                        break;
                    }
                    if (arr[i] == f && e =='0'){
                        avg +=((i)*s);
                        break;
                    }
                }
            }
            if (f == 'F') {
                sum+=s;
            }
        }

        if (avg < 1) {
            System.out.println("0.000000");
        }else{
            System.out.printf("%6f",avg/sum);
        }
    }

}

