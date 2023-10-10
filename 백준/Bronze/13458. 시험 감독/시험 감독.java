public class Main {
    static int read() throws Exception {
        int c, m = 0;

        while (true) {
            c = System.in.read() - 48;
            if (c < 0 || c > 9) return m;
            m = m * 10 + c;
        }
    }
    public static void main(String[] args) throws Exception{

        int N = read();
        long cnt=0;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=read();
        }

        int B = read();
        int C = read();

        for(int s : arr){
            cnt+=1;
            s-=B;
            cnt += func(s,C);
        }
        System.out.println(cnt);
    }

    private static int func(int site, int c) {
        if (site <= 0) return 0;
        if (site%c == 0) return site/c;
        return site/c+1;
    }
}
