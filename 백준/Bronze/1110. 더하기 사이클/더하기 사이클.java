import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a= Integer.parseInt(br.readLine());

        if(a == 0){
            System.out.println("1");
            return;
        }

        int x = a / 10 , y = a % 10 , z=0 ;
        String temp = "" , str =a +"";

        if (a < 10) {
            x = 0;
            str = "0" + str;
        }

        for(int i=1;i>0;i++){
            z = x+y;
            x = y;
            y = z%10;
            temp = x+""+y+"";
            if(str.equals(temp)){
                System.out.print(i);
                return;
            }
        }

    }
}