import java.util.*;
public class Main {

    static int[][] arr;
    static int T, num;

    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder(10);
        T = read();

        for (int i = 0; i < T; i++) {
            num = read();
            arr = new int[num][2];

            for (int j = 0; j < num; j++) {
                arr[j][0] = read();
                arr[j][1] = read();
            }

            // 서류 순 정렬
            Arrays.sort(arr, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return Integer.compare(o1[0], o2[0]);
                }
            });
            
            // 서류 1등은 통과
            int win = arr[0][1];	
            int cnt=0;
            for(int j=1;j<num;j++) {
                // 서류 기준 면접 점수 좋으면 통과
                if(win<arr[j][1]) {	
                    cnt++;
                    continue;
                }
                // 서류 점수 갱신
                win=arr[j][1];	
            }
            // 뽑힌 인원
            sb.append(num-cnt).append("\n"); 
        }
        System.out.println(sb);
    }

    static int read() throws Exception {
        int n = 0;
        boolean isNegative = false;
        while (true) {
            int input = System.in.read();
            if (input <= 32)
                return isNegative ? n * -1 : n;
            else if (input == '-')
                isNegative = true;
            else
                n = (n << 3) + (n << 1) + (input & 15);
        }
    }

}
