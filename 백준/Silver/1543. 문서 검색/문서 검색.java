import java.io.*;

class Main{
    public static void main(String[]args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String con = br.readLine();
        int len = con.length();
        int cnt=0;
        for(int i=0;i<=str.length()-len;i++){
            if(str.substring(i,i+len).equals(con)){
                cnt++;
                i+=len-1;
            }
        }
        System.out.print(cnt);
    }
}