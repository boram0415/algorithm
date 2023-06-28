import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new LinkedList<>();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            list.add(i+1);
        }
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < n; ) {
            int idx = list.size();
            if(i < n && idx==0) {
                System.out.println("NO");
                return;
            }
            for (int j = 0; j < idx; j++) {
                sb.append("+").append("\n");
                s.push(list.get(0));
                list.remove(0);
                if (arr[i] == s.peek()) {
                    break;
                }
            }
//            System.out.println(s.peek());
            while (s.size() != 0 && s.peek() == arr[i]) {
                sb.append("-").append("\n");
                s.pop();
                i++;
            }
        }
        System.out.println(sb);
    }
}
