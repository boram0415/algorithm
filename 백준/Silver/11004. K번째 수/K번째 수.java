import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()),K = Integer.parseInt(st.nextToken());
        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        quickSort(A, 0, N-1, K-1);
        System.out.println(A[K-1]);
    }
    public static void quickSort(int[] A,int S, int E, int K) {
        if(S < E) {
            int pivot = partition(A,S,E);
            if(pivot == K) return;
            else if(K <pivot) quickSort(A,S,pivot-1,K);
            else quickSort(A,pivot+1, E, K);
        }
    }

    public static int partition(int[] A, int S, int E) {
        if(S+1 == E) {
            if(A[S] > A[E]) {
                swap(A,S,E);
            }
            return E; // why??
        }
        int M = (S+E) /2;
        swap(A,S,M);
        int pivot = A[S];
        int l = S+1, r = E;
        while(l <= r) {
            while(pivot < A[r] && r>0) r--;
            while(pivot > A[l] && l<A.length-1) l++;
            if(l <= r) swap(A,l++,r--);
        }
        A[S] = A[r];
        A[r] = pivot;
        return r;

    }

    public static void swap(int[] A, int start, int end) {
        int temp = A[end];
        A[end] = A[start];
        A[start] = temp;
    }

    public static int read() throws IOException {
        int c= 0 , n =0;
        while(true){
            c = System.in.read()-48;
            if(c < 0 || c > 9) return n;
            n = n * 10 + c;
        }
    }

}