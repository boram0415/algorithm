
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    static String[] arr = {"Nevergonnagiveyouup", "Nevergonnaletyoudown",
            "Nevergonnarunaroundanddesertyou", "Nevergonnamakeyoucry",
            "Nevergonnasaygoodbye", "Nevergonnatellalieandhurtyou", "Nevergonnastop"};
    static boolean flag = true;

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            flag = true;
            String str = br.readLine().replaceAll(" ","");
            for (String i : arr) {
                if (str.equals(i)) {
                    flag = false;
                    break;
                }
            }
            if(flag) break;

        }

        if (flag) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
