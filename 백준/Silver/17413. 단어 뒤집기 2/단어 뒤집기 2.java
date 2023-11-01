import java.io.*;
import java.util.Stack;

public class Main {
    static Stack<Character> stack = new Stack();
    static StringBuilder sb = new StringBuilder();
    static String str;
    static int up;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        
        /*  1. <를 만나면 > 만날때까지 그냥 write
            2. 일반 문자열이면 stack 에 쌓고
            2. 공백을 만나면 stack 에서 빼서 write
        */
        boolean flag = true;
        for (up =0 ; up < str.length(); up++) {
            char strTemp = str.charAt(up);
            if (strTemp == ' ') {
                writeAndClearStack();
                sb.append(' ');
            }
            if (strTemp != '<' && strTemp != ' ') stack.add(strTemp);
            if (strTemp == '<') {
                writeAndClearStack();
                func();
            }
            if(up == str.length()-1) writeAndClearStack();
        }
        System.out.println(sb);
    }

    static void func() {
        if (str.charAt(up) == '<') {
            while (str.charAt(up) != '>') {
                sb.append(str.charAt(up++));
            }
            sb.append(str.charAt(up));
        }
    }

    static void writeAndClearStack() {
        while (!stack.isEmpty()) sb.append(stack.pop());
        stack.clear();
    }

}