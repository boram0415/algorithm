import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] agrs) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));       
        Deque<String> de = new ArrayDeque<>();
        StringTokenizer st;
        // 제일 처음 정수 입력
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            boolean flag = de.size()==0;
            st = new StringTokenizer(br.readLine());
            switch(st.nextToken()){
                case "push" : 
                    de.add(st.nextToken());
                    break;
                case "pop" : 
                    bw.write(flag==true ? "-1\n" : de.pollFirst()+"\n");
                    break;
                case "size" : 
                    bw.write(de.size()+"\n");
                    break;
                case "empty" : 
                    bw.write(de.isEmpty()==true ? "1\n" : "0\n");
                    break;
                case "front" : 
                    bw.write(flag==true ? "-1\n" : de.peek()+"\n");
                    break;
                case "back" : 
                    bw.write(flag==true ? "-1\n" : de.peekLast()+"\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
    
    
}