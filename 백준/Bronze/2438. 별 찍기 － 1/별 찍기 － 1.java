//*
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sf = new StringBuffer();
        int a =sc.nextInt();
        for(int i = 1 ; i <= a ;i++ ){
            int sum = i;
            while(sum > 0){
                sum--;
                sf.append("*");
            }
            sf.append("\n");
        }
        System.out.println(sf.toString());
	}

}