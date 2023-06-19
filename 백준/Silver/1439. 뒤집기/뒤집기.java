import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
        String T = new BufferedReader(new InputStreamReader(System.in)).readLine();
        char ch[] = T.toCharArray();
        int one = 0,zero=0;
        for (int i = 0; i < ch.length; i=i) {
            if (ch[i] =='0') {
                one++;
                while (ch[i] == '0') {
                    i++;
                    if(i >= ch.length-1) break;
                }
            }else{
                zero++;
                while (ch[i] == '1') {
                    i++;
                    if(i >= ch.length-1) break;
                }
            }
        }
        System.out.println(one < zero ? one : zero);
    }
}