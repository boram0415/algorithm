import java.util.*;

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

        Set<Integer> map = new TreeSet<>();
        map.add(a);
        map.add(b);
        map.add(c);

        Iterator i = map.iterator();
        while (i.hasNext()) {
            System.out.print(i.next()+" ");
        }

    }
}
