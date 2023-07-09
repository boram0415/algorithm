import java.io.*;
class Main{
    static StringBuilder SB = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int decimal = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);
        System.out.println(chkB(decimal, B));
    }
    static String chkB(int decimal, int B) {
        if(B<10) {
            return noAlphabet(decimal, B);
        }else if(B>10) {
            return withAlphabet(decimal, B);
        }
        return decimal+"";
    }
    private static String noAlphabet(int decimal, int B) {
        while(decimal!=0) {
            SB.append(decimal%B);
            decimal /= B;
        }
        return SB.reverse().toString();
    }
    private static String withAlphabet(int decimal, int B) {
        int remainder;
        while(decimal!=0) {
            remainder = decimal%B;
            SB.append(remainder>9 ? (char)(remainder+55) : (char)(remainder+48));
            decimal /= B;
        }
        return SB.reverse().toString();
    }
}