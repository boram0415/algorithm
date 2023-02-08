import java.io.*;
class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int div =n;
		
        if( n==1) {
            return;
        }
			
		for (int i = 2; i*i <= n; i++) {
			while (n % i == 0) {
				sb.append(i+"\n");
				n /= i;
			}
		}
		if(n != 1) sb.append(n);
		System.out.println(sb);
	}
}
