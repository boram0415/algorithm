import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] s = br.readLine().toCharArray();
        int a=0,b=0;
        for(int i=0;i<s.length;i++){
            if(s[i]=='2'){
                a++;
            }else{
                b++;
            }
        }

        if(a==b){
            System.out.println("yee");
        } else if (a < b) {
            System.out.println("e");
        }else{
            System.out.println("2");
        }

    }


}

