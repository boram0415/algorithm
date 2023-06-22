import java.io.*;
import java.util.*;
class Main {
    
    public static void main(String[]args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    

		String s = st.nextToken();
		int N = Integer.parseInt(st.nextToken());
		int tmp = 1;
		int ans = 0;
		
		for (int i = s.length()-1; i >= 0; i--) {
			char c = s.charAt(i);
			
			if('A'<= c && c <= 'Z') {
				ans += (c-'A'+10)*tmp;
			}else {
				ans += (c-'0')*tmp;
			}
			tmp *= N;
		}
		System.out.print(ans);

}
    
    
}