import java.io.*;
import java.util.*;

public class Main {
    static final int MAX_RANGE = 20000000;
    static final int OFFSET = 10000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] frequency = readFrequencies(br, n);

        int m = Integer.parseInt(br.readLine());
        StringBuilder result = generateResults(br, m, frequency);
        
        System.out.println(result.toString());
    }

    private static int[] readFrequencies(BufferedReader br, int count) throws IOException {
        int[] frequency = new int[MAX_RANGE + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < count; i++) {
            int number = Integer.parseInt(st.nextToken()) + OFFSET;
            frequency[number]++;
        }
        return frequency;
    }

    private static StringBuilder generateResults(BufferedReader br, int count, int[] frequency) throws IOException {
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < count; i++) {
            int query = Integer.parseInt(st.nextToken()) + OFFSET;
            sb.append(frequency[query]).append(" ");
        }
        return sb;
    }
}