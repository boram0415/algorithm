import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			
			int num = sc.nextInt();
			String str = sc.next();
			
			System.out.println(new StringBuffer(str).deleteCharAt(num -1));
		}
	}
}