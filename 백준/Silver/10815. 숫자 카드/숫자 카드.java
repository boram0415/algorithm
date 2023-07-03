import java.io.*;
import java.util.*;
public class Main {

    static int[] arr;

    private static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            // 피봇값의 기본 자리를 찾는 메소드
            int par = partition(arr, start, end);
            quickSort(arr, start, par - 1);
            quickSort(arr, par + 1, end);
        }

    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start-1;
        for (int j = start; j <= end-1; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(i, j);
            }
        }
        swap(i+1, end);
        return i+1;
    }

    private static void swap(int max, int min) {
        int tmp = arr[max];
        arr[max] = arr[min];
        arr[min] = tmp;
    }

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int A = Integer.valueOf(br.readLine());
        arr = new int[A];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<A;i++){
            arr[i] = Integer.valueOf(st.nextToken());
        }
        quickSort(arr,0,arr.length-1);
        int k = Integer.valueOf(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < k; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(Arrays.binarySearch(arr,num) > -1) sb.append("1 ");
            else sb.append("0 ");
        }
        System.out.println(sb);
    }
}
