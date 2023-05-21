import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder temp = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        String CK = "BUG";
        String in = "";
        while ((in = br.readLine()) != null) {
            temp.append(in);
            for (int i = 0; i < in.length(); i++) {
                // BUG 없을 때 바로 탈출
                if (in.indexOf(CK) == -1) {
                    temp.setLength(0);
                    break;
                }
                if (in.length() > 3 && in.contains(CK)) {
                    temp.setLength(0);
                    String re = in.replaceAll(CK, "");
                    temp.append(re);
                }
                in = temp.toString();
                temp.setLength(0);
            }

            if (in.length() == 0) {
                sb.append("\n");
            } else {
                sb.append(in + "\n");
            }
        }
        System.out.println(sb);

    }
}