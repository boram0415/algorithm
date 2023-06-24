import java.io.*;
class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            long now = Long.parseLong(br.readLine());
            if(Long.bitCount(now)==2) {
                for (int b = 0; b < 64; b++) {
                    if ((now & (1L << b)) != 0) sb.append(b).append(' ');
                }
                sb.append('\n');
            }else{
                for (int b = 0; b < 64; b++) {
                    if ((now & (1L << b)) != 0) sb.append(b-1).append(' ').append(b-1).append('\n');
                }
            }
        }
        bw.write(sb.toString());
        bw.flush();
    }
}
