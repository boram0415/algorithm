import java.io.*;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long N = Long.parseLong(st.nextToken());
		long M = Long.parseLong(st.nextToken());
        
		long A = Math.min(N, M);
		long B = Math.max(N, M);
		long sum = (((B + 1) * B) / 2) - (((A - 1) * A) / 2);
		
		System.out.println(sum);
	}

}