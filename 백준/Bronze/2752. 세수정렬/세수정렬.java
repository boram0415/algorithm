public class Main {
    static int read()throws Exception{
        int c,n=0;
        while (true) {
            c = System.in.read()-48;
            if( c < 0 || c > 9 ) return n;
            n = n * 10 + c;
        }
    }
    public static void main(String[] args) throws Exception{

        int a = read();
        int b = read();
        int c = read();

        int arr[] = new int[1000001];
        arr[a]++;
        arr[b]++;
        arr[c]++;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.print(i+" ");
            }
        }
    }
}
