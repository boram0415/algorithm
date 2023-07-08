import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> priQ = new PriorityQueue<>(Collections.reverseOrder());

        int size = Integer.parseInt(br.readLine());
        for(int i = 0; i < size; i++) {
            priQ.add(Integer.parseInt(br.readLine()));
        }
        while(!priQ.isEmpty()) sb.append(priQ.poll()).append("\n");
        System.out.println(sb.toString().trim());
    }

}
