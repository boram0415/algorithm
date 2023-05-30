import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine()),temp =0,space = 1;
        for (int i=0; i>-1; i++) {
            temp = 6*i;
            space += temp;
            if (space >= num) {
                System.out.println(i+1);
                return;
            }
        }
    }
}
