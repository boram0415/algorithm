import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long t = Long.parseLong(br.readLine());
        StringBuilder sb = new StringBuilder();
        long tmp = t;
        int cnt = 0;
        int i=2;

        while (tmp != 1) {

            if(tmp % i ==0){
                tmp /= i;
                sb.append(i).append(" ");
                cnt++;
                continue;
            }

            if (i >= (int)Math.sqrt(t)) {
                sb.append(tmp).append(" ");
                cnt++;
                break;
            }

            i++;
        }
        System.out.println(cnt+"\n"+sb);

    }
}