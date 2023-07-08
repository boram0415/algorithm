import java.io.*;
import java.util.*;

public class Main {
    static int cnt, k, result = -1;
    static int[] tmp = new int[5000001];
    static boolean flag = false;

    public static void main(String[] args) throws Exception {

        int A = readI();
        k =readI();
        int arr[] = new int[A];
        for (int i = 0; i < A; i++) {
            arr[i] = readI();
        }
        mergeSort(arr);
        System.out.println(k == 0 ? result : -1);
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

    private static void merge(int[] arr, int start, int mid, int end) {

        int part1 = start;
        int part2 = mid + 1;
        int idx = start;

        while (part1 <= mid && part2 <= end) {
            if (arr[part1] <= arr[part2]) {
                tmp[idx] = arr[part1++];
            } else {
                tmp[idx] = arr[part2++];
            }
            idx++;
        }

        // 남은 인자값 넣기
        while (part1 <= mid) {
            tmp[idx] = arr[part1++];
            idx++;
        }

        while (part2 <= end) {
            tmp[idx] = arr[part2++];
            idx++;
        }

        for (int t = start; t <= end; t++) {
            if (k == 0) {
                flag = true;
                break;
            }
            result = arr[t] = tmp[t];
            k--;
        }
    }
    static int readI() throws Exception{
        int c, n = 0;
        while (true){
            c = System.in.read() - 48;
            if (c < 0 || c > 9)
                return n;
            n = n * 10 + c;
        }
    }

}
