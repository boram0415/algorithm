import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int []arr ;
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        // 퀵 정렬 sort
        quickSort(arr,0,arr.length-1);
        System.out.println(arr[1]);
    }

    private static void quickSort(int[] arr , int start,int end) {
        if (start < end) {
            int part = partition(arr, start, end);
            quickSort(arr,start,part-1);
            quickSort(arr,part+1,end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int idx = start-1;
        for(int i=start;i<end;i++){
            if(arr[i] <= pivot){
                idx++;
                swap(idx,i);
            }
        }
        swap(idx+1,end);
        return idx+1;
    }
    private static void swap(int l,int r){
        int tmp = arr[r];
        arr[r] = arr[l];
        arr[l] = tmp;
    }


}
