import java.util.Set;
import java.util.TreeSet;

public class Main {
    static Set<Integer> set = new TreeSet<>();
    public static void main(String[] args) throws Exception{

        int A = read();
        int B = read();

        for (int i = 0; i < A; i++) set.add(read());
        for (int i = 0; i < B; i++) set.add(read());

        int cnt =B-(Math.abs(A-set.size()));
        System.out.println(A+B-(cnt*2));

    }

    static int read() throws Exception{
        int c,n=0;
        while (true) {
            c = System.in.read()-48;
            if(c < 0 || c > 9 ) return n;
            n = n * 10 + c ;
        }
    }
}