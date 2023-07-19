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

        int week = 7*24*60*60;

        int N = read();
        long sum =1;
        for (int i = 1; i <= N; i++) {
            sum *=i;
        }
        for (long i = 1; i <= 588107520; i++) {
            if (week*i == sum) {
                System.out.println(i);
            }
        }

    }
}
