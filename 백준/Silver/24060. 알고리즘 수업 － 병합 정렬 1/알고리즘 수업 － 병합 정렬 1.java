import java.io.*;
import java.util.*;
public class Main {
    static int cnt, k,result=-1;
    static int[] tmp = new int[5000001];
    static boolean flag = false;
    static int[] re ;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.valueOf(st.nextToken());
        int K = Integer.valueOf(st.nextToken());
        int arr[] = new int[A];
        k=K;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A; i++) {
            arr[i] = Integer.valueOf(st.nextToken());
        }
        mergeSort(arr);
//        System.out.println(Arrays.toString(arr));
        System.out.println(result);
    }

    private static void check(int change) {
        if (++cnt == k) {
            result = change;
            flag = true;
        }
    }

    private static boolean mergeSort(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    private static boolean mergeSort(int[] arr, int start, int end) {
        if (start < end && !flag) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
        return flag;
    }

    private static boolean merge(int[] arr,int start, int mid, int end) {

        int part1 = start;
        int part2 = mid+1;
        int idx = start;

        while (part1 <= mid && part2 <= end && !flag) {
            if (arr[part1] <= arr[part2]) {
                tmp[idx] = arr[part1++];
            } else {
                tmp[idx] = arr[part2++];
            }
            check(tmp[idx]);
            idx++;
        }

        if(flag) return true;

        // 남은 인자값 넣기
        while(part1 <= mid && !flag) {
            tmp[idx] = arr[part1++];
            check(tmp[idx]);
            idx++;
        }

        while(part2 <= end && !flag) {
            tmp[idx] = arr[part2++];
            check(tmp[idx]);
            idx++;
        }

        for (int t = start; t <= end; t++) {
            arr[t] = tmp[t];
        }

        if(flag) return true;

        return false;
    }

}
