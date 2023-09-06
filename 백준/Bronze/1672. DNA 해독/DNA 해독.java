import java.io.*;
import java.util.*;

public class Main {
    static char[][] dnaGraph = {{'A', 'C', 'A', 'G'}, {'C', 'G', 'T', 'A'}, {'A', 'T', 'C', 'G'}, {'G', 'A', 'G', 'T'}};
    static HashMap<Character, Integer> map = new HashMap<>();

    public static void main(String[] args) throws Exception {
        map.put('A', 0);
        map.put('G', 1);
        map.put('C', 2);
        map.put('T', 3);

        Stack<Character> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        while (stack.size() > 1) {
            int x = 0, y = 0;
            x = map.get(stack.pop());
            y = map.get(stack.pop());
            stack.push(dnaGraph[x][y]);
        }
        System.out.println(stack.pop());

    }
}
