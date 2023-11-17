import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder(100);
    static Set<Integer> set = new TreeSet<>();
    static int cnt = 0;
    static int zip[];

    public static void main(String[] args) throws Exception {

        int arr[] = new int[read()];

        for (int i = 0; i < arr.length; i++) {
            int num = read();
            arr[i] = num;
            set.add(num);
        }

        zip = new int[set.size()];
        Iterator i = set.iterator();
        while (i.hasNext()) zip[cnt++] = Integer.parseInt(i.next().toString());

        for (int h = 0; h < arr.length; h++)
            sb.append(binarySearch(arr[h], 0, zip.length - 1)).append(" ");

        System.out.println(sb);
    }

    private static int binarySearch(int findNum, int s, int e) {

        // 중간값
        int mid = (s + e) / 2;
        // 찾기
        if (findNum == zip[mid]) return mid;
        // 비교
        if (zip[mid] > findNum) return binarySearch(findNum, s, mid - 1);
        else return binarySearch(findNum, mid + 1, e);

    }

    private static int read() throws Exception {

        int c, n = System.in.read() & 15;
        boolean isNegative = n == 13;
        if (isNegative) n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return isNegative ? ~n + 1 : n;

    }
}
