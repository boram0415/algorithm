import java.io.*;
class Main {
    final static int N = 20000303;
    public static void main(String[] args) throws IOException {
        String n = new BufferedReader(new InputStreamReader(System.in)).readLine();
        int answer =0,tmp=(n.charAt(0)-'0') % N;
        for(int i=1 ; i < n.length();i++){
            answer = tmp*10+(n.charAt(i)-'0');
            tmp = answer % N;
        }
        System.out.print(tmp);
    }
}