import java.util.*;
import java.io.*;

public class Main {
    static int sum;
    static int idx=0;

    static void func(int hei, int wid ,int priorWid, int heightMax) {
        int x = wid - priorWid;
        int y = heightMax-hei;
        sum += (x*y);
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        int n[][] = new int[t][2];
        int heightMax = 0;
        for (int i = 0; i < n.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                n[i][j] = Integer.parseInt(st.nextToken());
            }
            heightMax = Math.max(heightMax, n[i][1]);
        }
        Arrays.sort(n, (o1, o2) -> {
            return o1[0] - o2[0];
        });

        int area = (n[n.length - 1][0] + 1 - n[0][0]) * heightMax;
        for (int i = 1; i < n.length; i++) {
            if (n[idx][1] <= n[i][1]) {
                func(n[idx][1],n[i][0],n[idx][0], heightMax);
                idx = i;
            }
        }
        int tmp =idx,len = n.length-1;
        if (idx != len) {
            idx = len;
            for (int j = len-1; j >= tmp ; j--) {
                if (n[idx][1] <= n[j][1]) {
                    func(n[idx][1],n[idx][0],n[j][0],heightMax);
                    idx = j;
                }
            }
        }
        System.out.println(area-sum);
    }
}