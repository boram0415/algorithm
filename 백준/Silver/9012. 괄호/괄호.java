import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] agrs) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        
        for(int i=0;i<t;i++){
            String str = br.readLine();
            Stack<Character> st = new Stack<>();
            for(int j=0;j<str.length();j++){
                if(str.charAt(j) == '(') {
                    st.push('(');
                }else if(str.charAt(j) == ')' && st.empty() == false 
                        && st.peek() == '('){
                    st.pop();
                }else{
                    st.push(')');
                }
            }
            sb.append(st.size() == 0 ? "YES\n" : "NO\n");
        }
        System.out.print(sb);
    }
}