import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String autok = br.readLine();
		int c = Integer.valueOf(autok);
		
		int i = c - String.valueOf(c).length() * 9;
		int m = 0;
		
		while(true) {
			i++;
			
			char[] c_arr = String.valueOf(i).toCharArray() ;
			int sum = i;
			
			for(int ca=0;ca < c_arr.length;ca++) {
				sum += (c_arr[ca]-48);
			}
			m = sum;
			if(sum == c || i >= c) {
				break;
			}
		}
		
		if(m != c) i = 0;
		System.out.println(i);
	}
}