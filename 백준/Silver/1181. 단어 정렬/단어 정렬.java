import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String arr[] = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                }
                return o1.compareTo(o2);
            }
        });
        StringBuilder sb = new StringBuilder();
        String temp = "";
        
        for (int j = 0; j < n; j++) {
            if (!temp.equals(arr[j])) {
                sb.append(arr[j] + "\n");
            }
            temp = arr[j];
        }
        System.out.println(sb);
    }
}
