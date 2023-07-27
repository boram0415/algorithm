
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

        System.out.println(read()+read());

    }

}
