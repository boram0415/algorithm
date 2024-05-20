import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for(int i=0;i<T;i++) { //T번 반복
			int n = Integer.parseInt(br.readLine()); //정수 n을 입력받는다.

			int index=0; //인덱스값을 구하기 위한 변수

			while(n>0) { //나누는 수가 0 이상이면 실행
				if(n%2==1) { //나머지가 1이면 이진수로 나타냈을 때 1이 됨
					System.out.print(index + " "); //인덱스값 출력 (줄바꿈 하지 않기 위해 print 사용)
				}
				n/=2; //n은 n를 2로 나눈 몫
				index++; //인덱스값 +1 하고
			}
			System.out.println(); //하나의 n이 끝나면 줄바꿈
		}
	}
}