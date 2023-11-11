import java.io.*;
class Main{

    public static void main(String []args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(20);
        String str = "";

        int max=Integer.MIN_VALUE;
        int arr[]  = new int[27];

        while((str = br.readLine()) != null){
            str = str.replaceAll(" ","");
            for(int i=0;i<str.length();i++){
                arr[str.charAt(i)-97]++;
            }
        }

        for(int i : arr){
            max = Math.max(max,i);
        }

        for(int i=0;i<arr.length;i++){
            if(max == arr[i]){
                sb.append((char)(i+97));
            }
        }
        System.out.print(sb);
    }

}