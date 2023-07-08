import java.io.*;
import java.util.*;

class Main{
    static int []arr;
    
    static int partition(int[] arr , int start,int end){
        int pivot = arr[end];
        int idx = start-1;
        for(int i=start;i<end;i++){
            if(arr[i]<=pivot){
                idx++;
                swap(idx,i);
            }
        }
        swap(idx+1,end);
        return idx+1;
    }
    
    static void quickSort(int[] arr , int start,int end){
        if(start<end){
            int part = partition(arr,start,end);
            quickSort(arr,start,part-1);
            quickSort(arr,part+1,end);
        }
    }
    
    static void swap(int l,int r){
        int tmp=arr[r];
        arr[r]=arr[l];
        arr[l]=tmp;
    }
    
    
    public static void main(String[]args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[3];
        for(int i=0;i<3;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        //퀵 정렬
        quickSort(arr,0,arr.length-1);
        System.out.print(arr[1]);
    }
    
}