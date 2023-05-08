import java.util.Scanner;

class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt() - 45 ;
        if(m < 0 ){
            m += 60 ;
            h = h == 0 ? 23 : h-1 ;  
        }
        System.out.println(h+" "+m);
	}

	
}