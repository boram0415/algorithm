
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

        int rivalCost=read();
        int rivalPer=read();

        int rival=rivalPer/rivalCost;

        int warCost=read();
        int warPer=rival*3*warCost;

        System.out.println(warPer);
    }
}