import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(20);
        String pan;
        

        while (!((pan = br.readLine()).equals("*"))) {
            boolean flag = false;
            int arr[] =new int[26];
            pan = pan.replaceAll(" ", "");
            for (int i = 0; i < pan.length(); i++) {
                ++arr[pan.charAt(i)-97];
            }
            for (int i : arr) {
                if(i==0) {
                    flag = true;
                    break;
                }
            }
            sb.append(flag ? "N" : "Y").append("\n");
        }
        System.out.println(sb.toString().trim());
    }
}
