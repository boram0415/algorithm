import java.util.Arrays;
public class Main {
    static int[] tmp = new int[500_005];
    static int[] a = new int[500_005];
    static int k, res;
    public static void main(String[] args) throws Exception {
        int n = readI(), i;
        k = readI();
        for (i = 0; i < n; i++){
            a[i] = readI();
        }
        merge_sort(0, n-1);
        if (k > 0)
            System.out.println(-1);
        else {
            System.out.println(res);
        }
    }

    static void merge_sort(int p, int r){
        if (p < r){
            int q = (p + r) / 2;
            merge_sort(p, q);
            merge_sort(q + 1, r);
            merge(p, q, r);
        }
    }

    static void merge(int p, int q, int r){
        int i = p, j = q + 1, t = 0;
        while (i <= q && j <= r){
            if (a[i] <= a[j]){
                tmp[t] = a[i];
                t++;
                i++;
            }
            else {
                tmp[t] = a[j];
                t++;
                j++;
            }
        }
        while (i <= q)
            tmp[t++] = a[i++];
        while (j <= r)
            tmp[t++] = a[j++];
        i = p;
        t = 0;
        while (i <= r && k > 0){
            res = a[i++] = tmp[t++];
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

