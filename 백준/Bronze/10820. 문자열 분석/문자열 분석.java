import java.io.*;

public class Main {

        static int arr[];
        static StringBuilder sb = new StringBuilder();
        public static void main(String[]args) throws Exception{

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str ="";
            while((str = br.readLine()) != null){
                arr = new int[4];
                for(int i=0;i<str.length();i++) {
                    char tmp = str.charAt(i);
                    if(tmp >= 'a' && tmp <= 'z'){
                        arr[0]++;
                    } else if(tmp >= 'A' && tmp <= 'Z') {
                        arr[1]++;
                    }else if(tmp >= '0' && tmp <= '9') {
                        arr[2]++;
                    }else {
                        arr[3]++;
                    }
                }
                for(int i: arr) {
                    sb.append(i).append(" ");
                }
            }//while end
            System.out.print(sb);
        }
}
